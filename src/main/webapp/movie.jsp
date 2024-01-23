<%@ page contentType="text/html; charset=GB18030" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="GB18030">
<title>${film.name}</title>
<link href="movie.css" type="text/css" rel="stylesheet"/>
</head>
<h1>${film.name}</h1>
<body>
<div id="container">
	<div id="header"></div>
	<div id="content">
	   <div id="filminfo" style="color:	#2F4F4F">
	     <table>
	       <tr>  
	       <td><img src="${film.poster}" height=600 width=400/></td>
	       <td><ul>
	       <ol style="list-style: none;">
	       <li>���${film.prize}</li>
	       <p></p>
	       <li>���ݣ�${film.director}</li>
	       <p></p>
	       <li>���ң�${film.country}</li>
	       <p></p>
	       <li>��ӳʱ�䣺${film.release}</li>
	       <p></p>
	       <li>����÷֣�${film.score}</li>
	       <p></p>
	       <li>�����飺${film.summary}</li>
	   	   <p></p>
	       </ol>
	       </ul></td>
	       </tr> 
	     </table>
	  </div>
	</div>
</div>
</body>
<div id="footer">
	<%@include file="footer.jsp" %>
</div>
</html>