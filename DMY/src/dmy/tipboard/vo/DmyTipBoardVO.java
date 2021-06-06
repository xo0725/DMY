package dmy.tipboard.vo;



public class DmyTipBoardVO {

	private String dtb_no;         //�Խ��ǹ�ȣ
	private String dtb_category;   //�Խ��Ǹ��
	private String dtb_subject;    //�Խ�������
	private String dtb_viewcnt;    //�Խ�����ȸ��
	private String dtb_goodcnt;    //�Խ������ƿ�
	private String dmb_no;         //ȸ����ȣ
	private String dtb_pw;         //�Խ��Ǻ�й�ȣ
	private String dtb_content;    //�Խ��ǳ���
	private String file;           //����
	private String dtb_file;       //�Խ�������
	private String dtb_shareyn;    //��������
	private String dtb_deleteyn;   //��������
	private String dtb_insertdate; //�Է���
	private String dtb_updatedate; //������
	
	//��ȸ�� 
	
	private String dgd_no;         
	private String dgd_goodyn;     //�Խ������ƿ�Ŭ������
	private String dgd_updatedate;
	private String session_no;
	private String my_goodyn;
	
	//����¡
	private String dpg_tableNo;    //���̺��ȣ �Խ���=04   
	private String dpg_pageSize;   
	private String dpg_groupSize;
	private String dpg_totalSize;
	private String dpg_curPage;
	
	private String keyword;			// �˻���
	private String searchFilter;    // �˻�����
	
	public DmyTipBoardVO() {
		
	}

	

	public DmyTipBoardVO(String dtb_no, String dtb_category, String dtb_subject, String dtb_viewcnt, String dtb_goodcnt,
			String dmb_no, String dtb_pw, String dtb_content, String file, String dtb_file, String dtb_shareyn,
			String dtb_deleteyn, String dtb_insertdate, String dtb_updatedate, String dgd_no, String dgd_goodyn,
			String dgd_updatedate, String session_no, String my_goodyn, String dpg_tableNo, String dpg_pageSize,
			String dpg_groupSize, String dpg_totalSize, String dpg_curPage, String keyword, String searchFilter) {
		
		super();
		this.dtb_no = dtb_no;
		this.dtb_category = dtb_category;
		this.dtb_subject = dtb_subject;
		this.dtb_viewcnt = dtb_viewcnt;
		this.dtb_goodcnt = dtb_goodcnt;
		this.dmb_no = dmb_no;
		this.dtb_pw = dtb_pw;
		this.dtb_content = dtb_content;
		this.file = file;
		this.dtb_file = dtb_file;
		this.dtb_shareyn = dtb_shareyn;
		this.dtb_deleteyn = dtb_deleteyn;
		this.dtb_insertdate = dtb_insertdate;
		this.dtb_updatedate = dtb_updatedate;
		this.dgd_no = dgd_no;
		this.dgd_goodyn = dgd_goodyn;
		this.dgd_updatedate = dgd_updatedate;
		this.session_no = session_no;
		this.my_goodyn = my_goodyn;
		this.dpg_tableNo = dpg_tableNo;
		this.dpg_pageSize = dpg_pageSize;
		this.dpg_groupSize = dpg_groupSize;
		this.dpg_totalSize = dpg_totalSize;
		this.dpg_curPage = dpg_curPage;
		this.keyword = keyword;
		this.searchFilter = searchFilter;
	}



	public String getdtb_no() {
		return dtb_no;
	}

	public void setdtb_no(String dtb_no) {
		this.dtb_no = dtb_no;
	}

	public String getdtb_category() {
		return dtb_category;
	}

	public void setdtb_category(String dtb_category) {
		this.dtb_category = dtb_category;
	}

	public String getdtb_subject() {
		return dtb_subject;
	}

	public void setdtb_subject(String dtb_subject) {
		this.dtb_subject = dtb_subject;
	}

	public String getdtb_viewcnt() {
		return dtb_viewcnt;
	}

	public void setdtb_viewcnt(String dtb_viewcnt) {
		this.dtb_viewcnt = dtb_viewcnt;
	}

	public String getdtb_goodcnt() {
		return dtb_goodcnt;
	}

	public void setdtb_goodcnt(String dtb_goodcnt) {
		this.dtb_goodcnt = dtb_goodcnt;
	}

	public String getdmb_no() {
		return dmb_no;
	}

	public void setdmb_no(String dmb_no) {
		this.dmb_no = dmb_no;
	}

	public String getdtb_pw() {
		return dtb_pw;
	}

	public void setdtb_pw(String dtb_pw) {
		this.dtb_pw = dtb_pw;
	}

	public String getdtb_content() {
		return dtb_content;
	}

	public void setdtb_content(String dtb_content) {
		this.dtb_content = dtb_content;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public String getdtb_file() {
		return dtb_file;
	}

	public void setdtb_file(String dtb_file) {
		this.dtb_file = dtb_file;
	}

	public String getdtb_shareyn() {
		return dtb_shareyn;
	}

	public void setdtb_shareyn(String dtb_shareyn) {
		this.dtb_shareyn = dtb_shareyn;
	}

	public String getdtb_deleteyn() {
		return dtb_deleteyn;
	}

	public void setdtb_deleteyn(String dtb_deleteyn) {
		this.dtb_deleteyn = dtb_deleteyn;
	}

	public String getdtb_insertdate() {
		return dtb_insertdate;
	}

	public void setdtb_insertdate(String dtb_insertdate) {
		this.dtb_insertdate = dtb_insertdate;
	}

	public String getdtb_updatedate() {
		return dtb_updatedate;
	}

	public void setdtb_updatedate(String dtb_updatedate) {
		this.dtb_updatedate = dtb_updatedate;
	}

	public String getdgd_no() {
		return dgd_no;
	}

	public void setdgd_no(String dgd_no) {
		this.dgd_no = dgd_no;
	}

	public String getdgd_goodyn() {
		return dgd_goodyn;
	}

	public void setdgd_goodyn(String dgd_goodyn) {
		this.dgd_goodyn = dgd_goodyn;
	}

	public String getdgd_updatedate() {
		return dgd_updatedate;
	}

	public void setdgd_updatedate(String dgd_updatedate) {
		this.dgd_updatedate = dgd_updatedate;
	}

	public String getSession_no() {
		return session_no;
	}

	public void setSession_no(String session_no) {
		this.session_no = session_no;
	}

	public String getMy_goodyn() {
		return my_goodyn;
	}

	public void setMy_goodyn(String my_goodyn) {
		this.my_goodyn = my_goodyn;
	}

	public String getdpg_tableNo() {
		return dpg_tableNo;
	}

	public void setdpg_tableNo(String dpg_tableNo) {
		this.dpg_tableNo = dpg_tableNo;
	}

	public String getdpg_pageSize() {
		return dpg_pageSize;
	}

	public void setdpg_pageSize(String dpg_pageSize) {
		this.dpg_pageSize = dpg_pageSize;
	}

	public String getdpg_groupSize() {
		return dpg_groupSize;
	}

	public void setdpg_groupSize(String dpg_groupSize) {
		this.dpg_groupSize = dpg_groupSize;
	}

	public String getdpg_totalSize() {
		return dpg_totalSize;
	}

	public void setdpg_totalSize(String dpg_totalSize) {
		this.dpg_totalSize = dpg_totalSize;
	}

	public String getdpg_curPage() {
		return dpg_curPage;
	}

	public void setdpg_curPage(String dpg_curPage) {
		this.dpg_curPage = dpg_curPage;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getSearchFilter() {
		return searchFilter;
	}

	public void setSearchFilter(String searchFilter) {
		this.searchFilter = searchFilter;
	}
	

}