<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Customer Feedback</title>
</head>
<body>
    <h2>Submit Your Feedback</h2>
    <form action="submit-feedback" method="post">
        <label for="product">Product ID:</label>
        <input type="text" id="product" name="productId" required><br><br>

        <label for="message">Feedback:</label><br>
        <textarea id="message" name="feedbackMessage" rows="4" cols="50" required></textarea><br><br>

        <input type="submit" value="Submit">
    </form>
</body>
</html>
