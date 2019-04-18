<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div id="messageWindow"></div>
<br>
<script src='http://code.jquery.com/jquery-3.1.1.min.js'></script>

<canvas id="sample" width=500 height=3></canvas>

<html>
<head>
<title>Insert title here</title>
<style>
.container {
	width: 600px;
	padding: 10px;
	border: 2px solid #3e3e41;
}
.talk_view {
	position: relative;
	width: 580px;
	height: 200px;
	padding: 5px;
	border: 1px dotted #3e3e41;
	overflow-y: scroll;
}
.talk_input {
	position: relative;
	margin-top: 20px;
	width: 500px;
	padding: 5px;
	border: 1px dotted #3e3e41;
}
</style>


<script>

var thisUserId = prompt('사용할 닉네임을 입력해주세요.');
var webSocket = new WebSocket('ws://' + window.location.host + '/lib/chat');
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
	$("#messageWindow").html("<p class='chat_content'>채팅에 참여하였습니다.</p>");
}

	// 텍스트에 박스에 입력한 대화내용을 서버에 전송한다.
	function sendTalk() {
		var obj = document.getElementById("talk_input");
		if (obj) {
			addTalk(obj.value); //대회내용을 추가한다.
			obj.value = ""; //텍스트필드 초기화
			obj.focus(); //커서를 텍스트필드에 위치한다.
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
</head>
<body>
	<div class="container">
		<div id="talk_view" class="talk_view"></div>
		<input type="text" name="talk_input" id="talk_input"
			class="talk_input"> <input type="button" name="talk_send"
			id="talk_send" value="입력" OnClick="sendTalk()">
	</div>
</body>
</html>
