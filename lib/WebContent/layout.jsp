<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<div id="messageWindow"></div>
<br>
<script src='http://code.jquery.com/jquery-3.1.1.min.js'></script>
<canvas id="sample" width=500 height=3></canvas>

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
	background-color: #666;
	padding: 20px;
	text-align: center;
	font-size: 35px;
	color: white;
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
	background-color: #777;
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

	<h2>채팅에 참여 해 보세요!!</h2>
	<p>축구 하이라이트 영상 입니다</p>

	<header>
		<h2>★☆ Sports Gallery ☆★</h2>
	</header>

	<section>
		<nav>

			<script>
				var thisUserId = prompt('사용할 닉네임을 입력해주세요.');
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
							"<p class='chat_content'>환영합니다</p>");
				}

				// 텍스트에 박스에 입력한 대화내용을 서버에 전송한다.
				function sendTalk(event) {
					var obj = document.getElementById("talk_input");
					if (obj) {
						addTalk(obj.value); //대회내용을 추가한다.
						obj.value = ""; //텍스트필드 초기화
						obj.focus(event); //커서를 텍스트필드에 위치한다.
					}
				}
				// 입력된 대화 내용을 대화창에 추가한다.
				function addTalk(content) {
					var obj = document.getElementById("talk_view");
					if (obj) {
						var line = thisUserId + " - " + content + "<br>";
						//이름 -내용을 저장
						obj.innerHTML += line; //내용을 추가한다.
					}
				}
			</script>

			<div class="container">
				<div id="talk_view" class="talk_view"></div>
				<input type="text" name="talk_input" id="talk_input"
					class="talk_input"> <input type="button" name="talk_send"
					id="talk_send" value="입력" OnClick="sendTalk()">
			</div>


		</nav>

		<article>

			<h1>실시간 하이라이트 게시물</h1>
			<p>
				<a href="https://www.youtube.com/watch?v=ye8tUXjxcm0">[2019
					아시안컵] 카타르 vs UAE 하이라이트 (4강)</a>
			</p>
			<p>
				<a href="https://www.youtube.com/watch?v=UwVXBwU4wDI">[아시안컵] 박항서
					매직-베트남vs요르단 16강 승부차기</a>
			</p>
			<p>
				<a href="https://www.youtube.com/watch?v=K1JFnE0FWcc">[2019
					아시안컵] UAE vs 호주 하이라이트 (8강)</a>
			</p>
			<p>
				<a href="https://www.youtube.com/watch?v=sztTwFqtWIQ">[2019
					아시안컵] 중국 vs 이란 하이라이트 (8강)</a>
			</p>
			<p>
				<a href="https://www.youtube.com/watch?v=X0hnlel-Sug">[2019
					아시안컵] 태국 vs 중국 하이라이트 (16강)</a>
			</p>


		</article>
	</section>


	<footer>

		<div class="footer">
			<a href="http://localhost:8080/javaproject/chatting.jsp"
				class="button"><button type="button" class="btn">축구</button></a> <a
				href="http://localhost:8080/javaproject/chatting.jsp" class="button"><button
					type="button" class="btn">야구</button></a> <a
				href="http://localhost:8080/javaproject/chatting.jsp" class="button"><button
					type="button" class="btn">농구</button></a> <a
				href="http://localhost:8080/javaproject/chatting.jsp" class="button"><button
					type="button" class="btn">골프</button></a> <a
				href="http://localhost:8080/javaproject/chatting.jsp" class="button"><button
					type="button" class="btn">수영</button></a>
		</div>
	</footer>

</body>
</html>
