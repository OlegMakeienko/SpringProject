<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <body>
        <h2>Enter your name, client! </h2>

        <br>
        <br>

        <%--@elvariable id="client" type=""--%>
        <form:form action="showDetails" modelAttribute="client">
            
            Name: <form:input path="name"/>
            <br>
            <br>
            Surname: <form:input path="surname"/>
            <br>
            <br>
            Phone number: <form:input path="phoneNumber"/>
            <br>
            <br>
            Model car: <form:select path="modelCar">
                <form:options items="${client.carsBrand}"/>
            </form:select>
            <br>
            <br>
            What term want to hire car?
            Hour <form:radiobutton path="hireTerm" value="hour"/>
            Day <form:radiobutton path="hireTerm" value="day"/>
            Week <form:radiobutton path="hireTerm" value="week"/>
            <br>
            <br>
            How long want to hire car? <form:input path="timesFrame"/>
            <br>
            <br>
            <input type="submit" value="OK">
        </form:form>>

    </body>
</html>