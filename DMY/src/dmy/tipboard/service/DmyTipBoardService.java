package dmy.tipboard.service;

import java.util.List;

import dmy.tipboard.vo.DmyTipBoardVO;



public interface DmyTipBoardService {

	  //�������� ���(������������)
			public List<DmyTipBoardVO> mylistboard(DmyTipBoardVO param);
			
		   //�Խ��Ǹ��
			public List<DmyTipBoardVO> listboard(DmyTipBoardVO param);
			
			//�Խ��Ǹ��(�����ڿ�)
			public List<DmyTipBoardVO> listallboard(DmyTipBoardVO param);
			
			//�Խ��ǻ󼼺���
			public List<DmyTipBoardVO> detailboard(DmyTipBoardVO param);
			
			//�Խ��ǵ��
			public int insertboard(DmyTipBoardVO param);
			
			//�Խ��Ǽ���
			public int updateboard(DmyTipBoardVO param);
			
			//�Խ��ǻ���
			public int deleteboard(DmyTipBoardVO param);
			
			//��ȸ������
			public int viewcntboard(DmyTipBoardVO param);
			
			//=======�Խ��� �� ���ƿ䱸��=========
			//1. ���ƿ� Ŭ������ ��ȸ
			public List<DmyTipBoardVO> goodYNboard(DmyTipBoardVO param);
			
			//2-1.���ƿ� Ŭ������  ��ȸ �� 0 ���̸� insert �ϱ�
			public int insertgoodcnt(DmyTipBoardVO param);
			
			//2-2.���ƿ� Ŭ������ ��ȸ ��� , ���� 'N'�� ��� 'Y'�� �����ϱ�
			//public int updategoodY(DmyTipBoardVO param);
			
			//2-3.���ƿ� Ŭ������ ��ȸ ��� , ���� 'Y'�� ��� 'N'���� �����ϱ�
			public int updategoodN(DmyTipBoardVO param);
		

}
