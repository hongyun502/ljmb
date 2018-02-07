<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<input type="button" value="CreateFormSubmit" onclick="MakeForm()" />

<script type="text/javascript">
function MakeForm() 
{ 
  // 创建一个 form 
  var form1 = document.createElement("form"); 
  form1.id = "form1"; 
  form1.name = "form1"; 
  // 添加到 body 中 
  document.body.appendChild(form1); 
  // 创建一个输入 
  var input = document.createElement("input"); 
  // 设置相应参数 
  input.type = "text"; 
  input.name = "value1"; 
  input.value = "1234567"; 
  // 将该输入框插入到 form 中 
  form1.appendChild(input); 
  // form 的提交方式 
  form1.method = "POST"; 
  // form 提交路径 
  form1.action = "/servlet/info"; 
  // 对该 form 执行提交 
  form1.submit(); 
  // 删除该 form 
  document.body.removeChild(form1); 
} 

</script>
</body>
</html>