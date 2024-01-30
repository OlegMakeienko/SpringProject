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
            <form:errors path="name"/>
            <br>
            <br>
            Surname: <form:input path="surname"/>
            <form:errors path="surname"/>
            <br>
            <br>
            Age: <form:input path="age"/>
            <form:errors path="age"/>
            <br>
            <br>
            Phone number: <form:input path="phoneNumber"/>
            <form:errors path="phoneNumber"/>
            <br>
            <br>
            Model car: <form:select path="modelCar">
                <form:options items="${client.carBrands}"/>
            </form:select>
            <br>
            <br>
            What term want to hire car?
            <form:radiobuttons path="hireTerm" items="${client.hireTerms}"/>
            <br>
            <br>
            How long want to hire car? <form:input path="timesFrame"/>
        <br>
        <br>
        Which language want you have service?
            <form:checkboxes path="languages" items="${client.languageList}"/>
            <input type="submit" value="OK"/>
        </form:form>>

    </body>
</html>