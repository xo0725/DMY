<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="dmy.notice.vo.DmyNoticeVO"%>
<%@ page import="javax.servlet.http.HttpSession" %>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<%
	
	Object obj = request.getAttribute("noticeList");

	List<DmyNoticeVO> list1 = (List<DmyNoticeVO>)obj;
	HttpSession session1 = request.getSession();
	String value = (String)session1.getAttribute("dmb_mf");
	System.out.println(">>>> " + value);	
	
	DmyNoticeVO dnvo = null;

	boolean keywordBool = false;
	boolean searchBool = false;
	
	DmyNoticeVO searchVO = (DmyNoticeVO)request.getAttribute("searchVO");
	
	
	keywordBool = searchVO.getKeyword()!=null&&searchVO.getKeyword()!="";
	searchBool = searchVO.getSearchFilter()!=null&&searchVO.getSearchFilter()!="";
	
%>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewprot" content="width=device-width, initial-scale=1.0" />
<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
<script type="text/javascript">
$(function(){
	
	$("#searchbtn").click(function(){
		console.log("검색 버튼 >>> 전체조회  컨트롤러로 이동")
		
		$("#boardForm").attr({
			"method":"POST",
			"action":"noticeList.dmy"
		}).submit();
	});
	
	$("#writeForm").click(function(){
        console.log("insertBoard value >>> " + $("#detailForm").val());
        $("#boardForm").attr("action","writeClick.dmy");
        $("#boardForm").submit();
    });
	
	$(".goDetail").click(function(){
		
		var dnt_no = $(this).parents().attr("data-num");
		
		$("#dnt_no").val(dnt_no);
		$("#detailForm").attr({
			"method":"POST",
			"action":"noticeListDetail.dmy"
		});
		$("#detailForm").submit();		
	})	
	
})
</script>

<link rel="stylesheet" type="text/css" href="css/notice/dmyNoticeListBoard.css">

</head>
<body>
<section>
	<div class="container">
	<form name="detailForm" id="detailForm" method="POST">
		<input type="hidden" name="dnt_no" id="dnt_no">
	</form>
	<h1>공지사항</h1>
	<form name="boardForm" id="boardForm" method="post">
		<input type="hidden" name="dnt_no" id="dnt_no">
		<div class="sub">
			<!-- 카테고리, 제목(+작성자) -->
			<div class="sub_category_subject">
				<div class="sub_subject" sytle="">
					<select name="searchFilter" id="searchFilter" sytle="border:none; border-right: 0px; border-top: 0px; color: var(--black); width: 60; height: 36; background-color: #EFEFEF;">
						<option value="제목">제목</option>
						<option value="내용">내용</option>
                        <option value="제목+내용">제목+내용</option>
                    </select>
				</div>
			</div>
			<!-- 검색 부분 -->
			<div class="sub_serach">
				<input type="text" name="keyword" id="keyword" placeholder="검색어 입력" size"50px" sytle="height : 36;">
                <input type="button" class="searchbtn" id="searchbtn" value="검색" style="border: none; border-right: 0px; border-top: 0px; color: var(--black); width: 60; height: 36;  background-color: #EFEFEF;"> 
            </div>
		</div>     
		<%
			if(value == null){
		%>
		<div>
			<input class="sub_insertbtn" type="button" value="글쓰기" id="writeForm">
		</div>
		<%
			}
		%>
	</form>

    
<!-- 게시물 -->
	<form class="selectForm" name="selectForm" id="selectForm" method="post">
		<input type="hidden" name="dnt_no" id="dnt_no">
	</form>
	<div class="board" style="padding-bottom: 24%;">
    	<div class="board_info">
        	<div class="info info_num" style="width: 10%;">글번호</div>
	        <div class="info info_category" style="width: 30%;">글제목</div>
	        <div class="info info_content" style="width: 60%;">내용</div>
	        <div class="info info_author" style="width: 10%;">작성일</div>
	        <div class="info info_author" style="width: 10%;">조회수</div>
	</div>
     
     
<%
		if(obj != null){
		list1 = (List)obj;
		int nCnt = list1.size();
		if(nCnt > 0){
			for(int i = 0; i < nCnt; i++){
				DmyNoticeVO param = (DmyNoticeVO)list1.get(i);
%>

	<div class="board_content" data-num="<%=param.getDnt_no()%>">
	    <div class="content content_num" style="width: 10%;"><%=param.getDnt_no()%></div>
	    <div class="goDetail" style="width: 30%; padding: 10px 0px; "><%=param.getDnt_subject()%></div>   
	    <div class="content content_author" style="width: 60%; padding: 10px 0px;"><%=param.getDnt_content()%></div>      
	    <div class="content content_author" style="width: 10%;"><%=param.getDnt_insertdate()%></div>
	    <div class="content content_author" style="width: 10%;"><%=param.getDnt_viewcnt()%></div>
	</div>
<%
               }
           }
%>

<%
		}
%>

 </div>
 </div>
</section>

</body>
</html>