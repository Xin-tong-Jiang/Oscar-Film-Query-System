<%@ page contentType="text/html; charset=GB18030" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="GB18030">
<title>${film.name}</title>
<link href="character.css" type="text/css" rel="stylesheet"/>
</head>
<h1>${film.name}</h1>
<body>
<div id="container">
	<div id="header"></div>
	<div id="content">
	   <div id="filminfo" style="color:#D4F2E7">
	     <table>
	       <tr>  
	       <td><img align="center" src="${film.poster}" height=600 width=400/></td>
	       <td><ul>
	       <ol style="list-style: none;">
	       <li>${film.prize}</li>
	       <p></p>
	       <li>${film.director}</li>
	       <p></p>
	       <li>${film.country}</li>
	       <p></p>
	       <li>${film.release}</li>
	       <p></p>
	       <li>${film.summary}</li>
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