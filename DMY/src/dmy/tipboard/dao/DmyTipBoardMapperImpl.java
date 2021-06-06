package dmy.tipboard.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import dmy.tipboard.vo.DmyTipBoardVO;


public class DmyTipBoardMapperImpl extends SqlSessionDaoSupport implements DmyTipBoardMapper{
	
	private static Logger log = Logger.getLogger(DmyTipBoardMapperImpl.class);

	//�������� ���(������������)
	@Override
	public List<DmyTipBoardVO> mylistboard(DmyTipBoardVO param) {

		log.info("DmyTipBoardMapperImpl mylistboard >>> " );
		log.info("DmyTipBoardMapperImpl mylistboard param >>> " + param);
		
		List<DmyTipBoardVO> list = getSqlSession().selectList("mylistboard");
		log.info("DmyTipBoardMapperImpl mylistboard list >>> " + list);
		
		return list;
	}
	
	//�Խ��Ǹ��
	@Override
	public List<DmyTipBoardVO> listboard(DmyTipBoardVO param) {
		
		log.info("DmyTipBoardMapperImpl listboard >>> " );
		log.info("DmyTipBoardMapperImpl listboard param >>> " + param);
		
		List<DmyTipBoardVO> list = getSqlSession().selectList("listboard");
		log.info("DmyTipBoardMapperImpl listboard list >>> " + list);
		
		return list;
	}
	
	//�Խ��Ǹ��(�����ڿ�)
	@Override
	public List<DmyTipBoardVO> listallboard(DmyTipBoardVO param) {

		log.info("DmyTipBoardMapperImpl listallboard >>> " );
		log.info("DmyTipBoardMapperImpl listallboard param >>> " + param);
		
		List<DmyTipBoardVO> list = getSqlSession().selectList("listallboard");
		log.info("DmyTipBoardMapperImpl listallboard list >>> " + list);
		
		
		return list;
	}
	
	//�Խ��ǻ󼼺���
	@Override
	public List<DmyTipBoardVO> detailboard(DmyTipBoardVO param) {

		log.info("DmyTipBoardMapperImpl detailboard >>> " );
		log.info("DmyTipBoardMapperImpl detailboard param >>> " + param);
		
		List<DmyTipBoardVO> list = getSqlSession().selectList("detailboard");
		log.info("DmyTipBoardMapperImpl detailboard list >>> " + list);
		
		return list;
	}

	//�Խ��ǵ��
	@Override
	public int insertboard(DmyTipBoardVO param) {
		
		log.info("DmyTipBoardMapperImpl insertboard >>> " );
		log.info("DmyTipBoardMapperImpl insertboard param >>> " + param);
		log.info("DmyTipBoardMapperImpl insertboard param.getStb_subject() >>> " + param.getdtb_subject());
		
		return (int)getSqlSession().insert("insertboard");
	}

	//�Խ��Ǽ���
	@Override
	public int updateboard(DmyTipBoardVO param) {

		log.info("DmyTipBoardMapperImpl updateboard >>> " );
		log.info("DmyTipBoardMapperImpl updateboard param >>> " + param);
		
		return (int)getSqlSession().update("updateboard");
	}

	//�Խ��ǻ���
	@Override
	public int deleteboard(DmyTipBoardVO param) {

		log.info("DmyTipBoardMapperImpl deleteboard >>> " );
		log.info("DmyTipBoardMapperImpl deleteboard param >>> " + param);
		
		return (int)getSqlSession().update("deleteboard");
	}

	//��ȸ������
	@Override
	public int viewcntboard(DmyTipBoardVO param) {

		log.info("DmyTipBoardMapperImpl viewcntboard >>> " );
		log.info("DmyTipBoardMapperImpl viewcntboard param >>> " + param);
		
		return (int)getSqlSession().update("viewcntboard");
	}

	//=======�Խ��� �� ���ƿ䱸��=========
	//1. ���ƿ� Ŭ������ ��ȸ
	@Override
	public List<DmyTipBoardVO> goodYNboard(DmyTipBoardVO param) {

		log.info("DmyTipBoardMapperImpl goodYNboard >>> " );
		log.info("DmyTipBoardMapperImpl goodYNboard param >>> " + param);
		
		return getSqlSession().selectList("goodYNboard");
	}

	//2-1.���ƿ� Ŭ������  ��ȸ �� 0 ���̸� insert �ϱ�
	@Override
	public int insertgoodcnt(DmyTipBoardVO param) {

		log.info("DmyTipBoardMapperImpl insertgoodcnt >>> " );
		log.info("DmyTipBoardMapperImpl insertgoodcnt param >>> " + param);
		
		return (int)getSqlSession().insert("insertgoodcnt");
	}
	/*
	//2-2.���ƿ� Ŭ������ ��ȸ ��� , ���� 'N'�� ��� 'Y'�� �����ϱ�
	@Override
	public int updategoodY(DmyTipBoardVO param) {
		
		log.info("DmyTipBoardMapperImpl updategoodY >>> " );
		log.info("DmyTipBoardMapperImpl updategoodY param >>> " + param);
		
		return (int)getSqlSession().update("updategoodY");
	}
*/
	//2-3.���ƿ� Ŭ������ ��ȸ ��� , ���� 'Y'�� ��� 'N'���� �����ϱ�
	@Override
	public int updategoodN(DmyTipBoardVO param) {

		log.info("DmyTipBoardMapperImpl updategoodN >>> " );
		log.info("DmyTipBoardMapperImpl updategoodN param >>> " + param);
		
		return (int)getSqlSession().update("updategoodN");
	}
	

}
