 <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
 <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://w3.org/TR/html4/loose.dtd">
 <html>
 <head>
 <meta http-equiv="Content-Type" content="text/html; charset-ISO-8859-1"> 
  <title>wyliczenie kredytu</title> 
  </head>
  <body>
 <form action="hello" method="get">
  <fieldset>
    <legend>wyliczanie raty</legend>
    wnioskowana kwota kredytu:<br>
    <input type="text" name="kwota"><br>
    Ilosc rat:<br>
    <input type="text" name="ilosc" ><br>
    Oprocentowanie:<br>
    <input type="text" name="oprocentowanie"><br>
    Oplata stala:<br>
    <input type="text" name="oplata"><br>
    rodzaj rat:  <br>
      <input type="radio" name="rodzaj" value="malejaca" checked> malejaca<br>
      <input type="radio" name="rodzaj" value="stala"> stala<br>
    <input type="submit" value="Submit">
  </fieldset>
</form>
</body>
</html> 