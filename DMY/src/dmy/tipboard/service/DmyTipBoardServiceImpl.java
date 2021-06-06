package dmy.tipboard.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dmy.tipboard.dao.DmyTipBoardMapper;
import dmy.tipboard.vo.DmyTipBoardVO;


@Service
@Transactional
public class DmyTipBoardServiceImpl implements DmyTipBoardService{
	
	private static Logger log = Logger.getLogger(DmyTipBoardServiceImpl.class);
	
	@Autowired
	private DmyTipBoardMapper dmyTipBoardMapper;

	//�������� ���(������������)
	@Override
	public List<DmyTipBoardVO> mylistboard(DmyTipBoardVO param) {

		log.info("DmyTipBoardServiceImpl mylistboard >>> ");
		log.info("DmyTipBoardServiceImpl mylistboard param >>> " + param);
		
		List<DmyTipBoardVO> list = new ArrayList<DmyTipBoardVO>();
		list = dmyTipBoardMapper.mylistboard(param);
		log.info("DmyTipBoardServiceImpl mylistboard list >>> " + list);
		
		return list;
	}

	
	//�Խ��Ǹ��
	@Override
	public List<DmyTipBoardVO> listboard(DmyTipBoardVO param) {
		
		log.info("DmyTipBoardServiceImpl listboard >>> ");
		log.info("DmyTipBoardServiceImpl listboard param >>> " + param);
		
		List<DmyTipBoardVO> list = new ArrayList<DmyTipBoardVO>();
		list = dmyTipBoardMapper.listboard(param);
		log.info("DmyTipBoardServiceImpl listboard list >>> " + list);
		
		return list;
	}
	
	//�Խ��Ǹ��(�����ڿ�)
	@Override
	public List<DmyTipBoardVO> listallboard(DmyTipBoardVO param) {


		log.info("DmyTipBoardServiceImpl listallboard >>> ");
		log.info("DmyTipBoardServiceImpl listallboard param >>> " + param);
		
		List<DmyTipBoardVO> list = new ArrayList<DmyTipBoardVO>();
		list = dmyTipBoardMapper.listallboard(param);
		log.info("DmyTipBoardServiceImpl listallboard list >>> " + list);
		
		return list;
	}
	
	//�Խ��ǻ󼼺���
	@Override
	public List<DmyTipBoardVO> detailboard(DmyTipBoardVO param) {
		log.info("DmyTipBoardServiceImpl detailboard >>> ");
		log.info("DmyTipBoardServiceImpl detailboard param >>> " + param);
		
		List<DmyTipBoardVO> list = new ArrayList<DmyTipBoardVO>();
		list = dmyTipBoardMapper.detailboard(param);
		log.info("DmyTipBoardServiceImpl detailboard list >>> " + list);
		
		return list;
	}
	
	//�Խ��ǵ��
	@Override
	public int insertboard(DmyTipBoardVO param) {
		
		log.info("DmyTipBoardServiceImpl insertboard >>> ");
		log.info("DmyTipBoardServiceImpl insertboard param >>> " + param);
		log.info("DmyTipBoardServiceImpl insertboard param.getSmb_no() >>> " + param.getdmb_no());
		return dmyTipBoardMapper.insertboard(param);
	}

	//�Խ��Ǽ���
	@Override
	public int updateboard(DmyTipBoardVO param) {

		log.info("DmyTipBoardServiceImpl updateboard >>> ");
		log.info("DmyTipBoardServiceImpl updateboard param >>> " + param.getdtb_category());

		
		return dmyTipBoardMapper.updateboard(param);
	}


	//�Խ��ǻ���
	@Override
	public int deleteboard(DmyTipBoardVO param) {

		log.info("DmyTipBoardServiceImpl deleteboard >>> ");
		log.info("DmyTipBoardServiceImpl deleteboard param >>> " + param);
		
		return dmyTipBoardMapper.deleteboard(param);
	}

	//��ȸ������
	@Override
	public int viewcntboard(DmyTipBoardVO param) {

		log.info("DmyTipBoardServiceImpl viewcntboard >>> ");
		log.info("DmyTipBoardServiceImpl viewcntboard param >>> " + param);
		
		
		return dmyTipBoardMapper.viewcntboard(param);
	}


	//=======�Խ��� �� ���ƿ䱸��=========
	//1. ���ƿ� Ŭ������ ��ȸ
	@Override
	public List<DmyTipBoardVO> goodYNboard(DmyTipBoardVO param) {
		
		log.info("DmyTipBoardServiceImpl goodYNboard >>> ");
		log.info("DmyTipBoardServiceImpl goodYNboard param >>> " + param);
		
		
		return dmyTipBoardMapper.goodYNboard(param);
	}

	//2-1.���ƿ� Ŭ������  ��ȸ �� 0 ���̸� insert �ϱ�
	@Override
	public int insertgoodcnt(DmyTipBoardVO param) {
		
		log.info("DmyTipBoardServiceImpl insertgoodcnt >>> ");
		log.info("DmyTipBoardServiceImpl insertgoodcnt param >>> " + param);
		log.info("DmyTipBoardServiceImpl insertgoodcnt param.getSession_no >>> " + param.getSession_no());
		log.info("DmyTipBoardServiceImpl insertgoodcnt param.getStb_no >>> " + param.getdtb_no());
		
		return dmyTipBoardMapper.insertgoodcnt(param);
	}
	/*
	//2-2.���ƿ� Ŭ������ ��ȸ ��� , ���� 'N'�� ��� 'Y'�� �����ϱ�
	@Override
	public int updategoodY(DmyTipBoardVO param) {
		
		log.info("DmyTipBoardServiceImpl updategoodY >>> ");
		log.info("DmyTipBoardServiceImpl updategoodY param >>> " + param);
		log.info("DmyTipBoardServiceImpl updategoodY param.getSmb_no >>> " + param.getdmb_no());
		log.info("DmyTipBoardServiceImpl updategoodY param.getStb_no >>> " + param.getdtb_no());
		

		return dmyTipBoardMapper.updategoodY(param);
	}
*/
	//2-3.���ƿ� Ŭ������ ��ȸ ��� , ���� 'Y'�� ��� 'N'���� �����ϱ�
	@Override
	public int updategoodN(DmyTipBoardVO param) {
		
		log.info("DmyTipBoardServiceImpl updategoodN >>> ");
		log.info("DmyTipBoardServiceImpl updategoodN param >>> " + param);
		log.info("DmyTipBoardServiceImpl updategoodY param.getSmb_no >>> " + param.getdmb_no());
		log.info("DmyTipBoardServiceImpl updategoodY param.getStb_no >>> " + param.getdtb_no());
		

		return dmyTipBoardMapper.updategoodN(param);
	}


}
