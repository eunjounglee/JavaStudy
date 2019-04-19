<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<script src='http://code.jquery.com/jquery-3.1.1.min.js'></script>

<html lang="en">
<head>
<title>하이라이트 모음</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">

<style>
* {
	box-sizing: border-box;
}

body {
	font-family: Arial, Helvetica, sans-serif;
}

/* Style the header */
header {
	background-color: #ADD8E6;
	padding: 20px;
	text-align: center;
	font-size: 35px;
	color: black;
}

/* Create two columns/boxes that floats next to each other */
nav {
	float: left;
	width: 30%;
	height: 300px; /* only for demonstration, should be removed */
	background: #ccc;
	padding: 20px;
}

/* Style the list inside the menu */
nav ul {
	list-style-type: none;
	padding: 0;
}

article {
	float: left;
	padding: 20px;
	width: 70%;
	background-color: #f1f1f1;
	height: 300px; /* only for demonstration, should be removed */
}

/* Clear floats after the columns */
section:after {
	content: "";
	display: table;
	clear: both;
}

/* Style the footer */
footer {
	background-color: #1E90FF;
	padding: 10px;
	text-align: center;
	color: white;
}

/* Responsive layout - makes the two columns/boxes stack on top of each other instead of next to each other, on small screens */
@media ( max-width : 600px) {
	nav, article {
		width: 100%;
		height: auto;
	}
}

.container {
	width: 100%;
	padding: 10px;
	border: 2px solid #3e3e41;
}

.talk_view {
	position: relative;
	width: 99%;
	height: 200px;
	padding: 5px;
	border: 1px dotted #3e3e41;
	overflow-y: scroll;
}

.talk_input {
	position: relative;
	margin-top: 20px;
	width: 80%;
	padding: 5px;
	border: 1px dotted #3e3e41;
}

.footer {
	padding-left: center;
	padding-top: center;
}

.btn {
	padding-left: 20px;
	padding-right: 20px;
	text-align: center;
	margin-right: 6%;
}
</style>
</head>
<body>

	<h2>채팅에 참여해 보세요!!</h2>
	<p>★☆★☆ 농구 하이라이트 영상 입니다★☆★☆ </p>

	<header>
		<h2>★☆ Sports Gallery ☆★</h2>
	</header>

	<section>
		<nav>

			<script>
				var nickname = prompt('사용할 닉네임을 입력해주세요.');
				var webSocket = new WebSocket('ws://' + window.location.host
						+ '/lib/chat');
				webSocket.onerror = function(event) {
					onError(event)
				};
				function onError(event) {
					alert(event.data);
				}

				webSocket.onopen = function(event) {
					onOpen(event)
				};
				function onOpen(event) {
					$("#messageWindow").html(
							"<p class='chat_content'>" + nickname
									+ "님 채팅에 참여하였습니다.</p>");
				}

				webSocket.onmessage = function(event) {
					onMessage(event)
				};
				function onMessage(event) {
					var data = $.parseJSON(event.data);
					$("#messageWindow").append(data.msg + "<br>");
				}
				
				function send() {
					var inputMessage = $("#inputMessage").val();
					webSocket.send('[' + nickname + '] : ' + inputMessage);
					$("#inputMessage").val("");
				}
				
				
			</script>

			<div class="container">
				<div id="talk_view" class="talk_view">
				<div id="messageWindow"></div>
				</div>
				<br> <input id="inputMessage" type="text" > 
				     <input type="submit" value="send" onclick="send()">
			
      </div>

		</nav>

		<article>

			<h1>실시간 하이라이트 게시물</h1>
			<p>
				<a href="https://www.youtube.com/watch?v=OoKhUtHupmA">
				[안영준x김종규x라건아 대활약] 2019 농구월드컵으로 가는 마지막길</a>
			</p>
			<p>
				<a href="https://www.youtube.com/watch?v=7qKczi0smac">
				"2019 NBA 올스타전" 풀 하이라이트 다시보기! 팀 르브론 VS 팀 야니스! 3쿼터부터 승부욕 불타는거 미쳤다</a>
			</p>
			<p>
				<a href="https://www.youtube.com/watch?v=rutfwWpchRI">
				[프로농구] SK : DB 경기 하이라이트 (10.13)</a>
			</p>
			<p>
				<a href="https://www.youtube.com/watch?v=2SnkmnUXrN0">
				2018-2019 KBL 프로농구 하이라이트 Top5</a>
			</p>
			<p>
				<a href="https://www.youtube.com/watch?v=3m0Ojm57rkk">
				2019 중국농구월드컵 China Basketball World Cup 아시아최종예선Asia Qualifiers A조 1R 5차전 중국CHINA vs 대한민국KOREA H/L</a>
			</p>


		</article>
	</section>


	<footer>

		<div class="footer">
			 <a
				href="http://localhost:8080/javaproject/chatting.jsp" class="button"><button
					type="button" class="btn">축구</button></a> <a
				href="http://localhost:8080/javaproject/chatting.jsp" class="button"><button
					type="button" class="btn">야구</button></a> <a
				href="http://localhost:8080/javaproject/chatting.jsp" class="button"><button
					type="button" class="btn">골프</button></a> <a
				href="http://localhost:8080/javaproject/chatting.jsp" class="button"><button
					type="button" class="btn">수영</button></a>
		</div>
	</footer>

</body>
</html>
