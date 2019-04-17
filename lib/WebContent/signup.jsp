<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

    <form method="post" action = "signup_proc.jsp">
    ID : <Input type = "text" name="id" onblur="move()"> <br>
    PW : <Input type = "password" name="pw"><br>
        이름 : <Input type = "text" name="name"><br>
       <Input type = "submit" value="회원가입">
       </form>
    
     <script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
 <script>
 function move() {
 $.ajax({
 url : 'idcheck.jsp',
 type : 'get',
 data : {"id" : $('input[name=id]').val()},
 success : function(result) {
	 $("body").append(result);
 //console.log(result);
 }
 });
 }
</script>