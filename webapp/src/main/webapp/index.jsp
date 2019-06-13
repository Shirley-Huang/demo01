<%--放在jsp页面的第一行，用来指定响应的类型和编码格式,这样浏览器就可以从响应中获得编码格式了--%>
<%@ page contentType="text/html; charset=utf-8"%>
<html>
<head>
    <title>我的前端</title>
</head>

<script type="text/javascript">
    //原生ajax请求
    function testOriginalAjaxMethod(){
        var xmlhttp;
        if(window.XMLHttpRequest){
            //code for IE7+ Firefox chrome opera safari
            xmlhttp = new XMLHttpRequest();
        }else{
            //code for IE6 IE5
            xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
        }

        xmlhttp.onreadystatechange = function(){
            if(xmlhttp.readyState == 4 && xmlhttp.status == 200){
                document.getElementById("myDiv1").innerHTML=xmlhttp.responseText;
            }
        }

        //GET请求
        //xmlhttp.open("GET", "/ajaxOriginalMethod.asp", true);
        //xmlhttp.send();

        //POST请求
        xmlhttp.open("POST", "/ajaxOriginalMethod.asp", true);
        xmlhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
        xmlhttp.send("userName=Huangdandan&passwd=123456");
    }

    $.ajax({
        type:"get",
        dataType:"html",
        url:'',
        data:'',
        success:function (data) {
            if(data != ""){
                console.log(data);
            }else{

            }
        }
    });
</script>


<body>


<h2>ajax请求</h2>
<button type="button" onclick="testOriginalAjaxMethod()">ajax原生请求</button>
<div id="myDiv1"></div>

<hr/>

<button type="button" onclick="testOriginalAjaxMethod()">ajax原生请求</button>
<div id="myDiv2"></div>

</body>
</html>
