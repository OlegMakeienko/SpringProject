<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <body>
        <h2>Hi client!!! You are welcome!!!</h2>

        <br>
        <br>

        <%-- <h1>Your name is ${param.clientName}</h1> --%>

        <h2>Clients name: ${client.name}</h2>
        <br>
        <h2>Clients surname: ${client.surname}</h2>
        <br>
        <h2>Clients age: ${client.age}</h2>
        <br>
        <h2>Clients phone number: ${client.phoneNumber}</h2>
        <br>
        <h2>Clients chosen car: ${client.modelCar}</h2>
        <br>
        <h2>Clients want to hire the car: ${client.timesFrame} ${client.hireTerm}</h2>
        <br>
        <h2>Client want to have service with: <ul>
            <c:forEach var="lang" items="${client.languages}">
                <li>
                    ${lang}
                </li>
            </c:forEach>
        </ul>
        </h2>



    </body>
</html>