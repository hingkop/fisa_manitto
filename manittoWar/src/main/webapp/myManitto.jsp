<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내 마니또 조회</title>
<style>
/* CSS 스타일링 */
body {
	font-family: Arial, sans-serif;
	text-align: center;
	background-color: #f4f4f4;
	margin: 0;
	padding: 0;
}

.img-container {
	margin-top: 50px;
}

h2 {
	margin-top: 20px;
}

.message {
	margin-top: 20px;
	font-style: italic;
	color: #777;
}

img {
	display: block;
	margin: 0 auto;
}

.myPageButton {
	position: absolute;
	top: 20px;
	right: 20px;
	padding: 10px 20px;
	background-color: #3498db;
	color: white;
	border: none;
	border-radius: 5px;
	cursor: pointer;
}
</style>
</head>
<body>
	<div class="img-container">
		<img alt="" src="images/giftbox_open.png" width="200" height="200">
	</div>

	<h2>나의 마니또</h2>
	<div th:if="${manitto}" class="message">
		<p th:text="${'내 마니또는 ' + manitto + ' 입니다.'}"></p>
	</div>
	<div th:unless="${manitto}" class="message">
		<p>아직 마니또가 배정되지 않았습니다.</p>
	</div>

	<!-- 수정된 myPage로 이동하는 버튼 -->
	<button class="myPageButton" onclick="goToMyPage()">마이페이지</button>

	<script>
		function goToMyPage() {
			window.location.href = '/myPage.html';
		}
	</script>
</body>
</html>
    