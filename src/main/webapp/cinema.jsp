<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="ru.job4j.CinemaServlet" %>
<%@ page import="ru.job4j.Place" %>
<%@ page import="ru.job4j.Main" %>
<!doctype html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
          integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
            integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
            integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
            integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>

    <title>Сервис-кинотеатр</title>
</head>
<body>
<div class="container">
    <div class="row pt-3">
        <h4>
            Бронирование месте на сеанс
        </h4>
        <table class="table table-bordered">
            <thead>
            <tr>
                <th style="width: 120px;">Ряд / Место</th>
                <th>1</th>
                <th>2</th>
                <th>3</th>
                <th>4</th>
                <th>5</th>
                <th>6</th>
                <th>7</th>
                <th>8</th>
                <th>9</th>
                <th>10</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <th>1</th>
                <td><input type="radio" name="place" value="11"> Ряд 1, Место 1</td>
                <td><input type="radio" name="place" value="11"> Ряд 1, Место 2</td>
                <td><input type="radio" name="place" value="11"> Ряд 1, Место 3</td>
                <td><input type="radio" name="place" value="11"> Ряд 1, Место 4</td>
                <td><input type="radio" name="place" value="11"> Ряд 1, Место 5</td>
                <td><input type="radio" name="place" value="11"> Ряд 1, Место 6</td>
                <td><input type="radio" name="place" value="11"> Ряд 1, Место 7</td>
                <td><input type="radio" name="place" value="11"> Ряд 1, Место 8</td>
                <td><input type="radio" name="place" value="11"> Ряд 1, Место 9</td>
                <td><input type="radio" name="place" value="11"> Ряд 1, Место 10</td>
            </tr>
            <tr>
                <th>2</th>
                <td><input type="radio" name="place" value="11"> Ряд 2, Место 1</td>
                <td><input type="radio" name="place" value="11"> Ряд 2, Место 2</td>
                <td><input type="radio" name="place" value="11"> Ряд 2, Место 3</td>
                <td><input type="radio" name="place" value="11"> Ряд 2, Место 4</td>
                <td><input type="radio" name="place" value="11"> Ряд 2, Место 5</td>
                <td><input type="radio" name="place" value="11"> Ряд 2, Место 6</td>
                <td><input type="radio" name="place" value="11"> Ряд 2, Место 7</td>
                <td><input type="radio" name="place" value="11"> Ряд 2, Место 8</td>
                <td><input type="radio" name="place" value="11"> Ряд 2, Место 9</td>
                <td><input type="radio" name="place" value="11"> Ряд 2, Место 10</td>
            </tr>
            <tr>
                <th>2</th>
                <td><input type="radio" name="place" value="11"> Ряд 3, Место 1</td>
                <td><input type="radio" name="place" value="11"> Ряд 3, Место 2</td>
                <td><input type="radio" name="place" value="11"> Ряд 3, Место 3</td>
                <td><input type="radio" name="place" value="11"> Ряд 3, Место 4</td>
                <td><input type="radio" name="place" value="11"> Ряд 3, Место 5</td>
                <td><input type="radio" name="place" value="11"> Ряд 3, Место 6</td>
                <td><input type="radio" name="place" value="11"> Ряд 3, Место 7</td>
                <td><input type="radio" name="place" value="11"> Ряд 3, Место 8</td>
                <td><input type="radio" name="place" value="11"> Ряд 3, Место 9</td>
                <td><input type="radio" name="place" value="11"> Ряд 3, Место 10</td>
            </tr>
            <tr>
                <th>2</th>
                <td><input type="radio" name="place" value="11"> Ряд 4, Место 1</td>
                <td><input type="radio" name="place" value="11"> Ряд 4, Место 2</td>
                <td><input type="radio" name="place" value="11"> Ряд 4, Место 3</td>
                <td><input type="radio" name="place" value="11"> Ряд 4, Место 4</td>
                <td><input type="radio" name="place" value="11"> Ряд 4, Место 5</td>
                <td><input type="radio" name="place" value="11"> Ряд 4, Место 6</td>
                <td><input type="radio" name="place" value="11"> Ряд 4, Место 7</td>
                <td><input type="radio" name="place" value="11"> Ряд 4, Место 8</td>
                <td><input type="radio" name="place" value="11"> Ряд 4, Место 9</td>
                <td><input type="radio" name="place" value="11"> Ряд 4, Место 10</td>
            </tr>
            <tr>
                <th>2</th>
                <td><input type="radio" name="place" value="11"> Ряд 5, Место 1</td>
                <td><input type="radio" name="place" value="11"> Ряд 5, Место 2</td>
                <td><input type="radio" name="place" value="11"> Ряд 5, Место 3</td>
                <td><input type="radio" name="place" value="11"> Ряд 5, Место 4</td>
                <td><input type="radio" name="place" value="11"> Ряд 5, Место 5</td>
                <td><input type="radio" name="place" value="11"> Ряд 5, Место 6</td>
                <td><input type="radio" name="place" value="11"> Ряд 5, Место 7</td>
                <td><input type="radio" name="place" value="11"> Ряд 5, Место 8</td>
                <td><input type="radio" name="place" value="11"> Ряд 5, Место 9</td>
                <td><input type="radio" name="place" value="11"> Ряд 5, Место 10</td>
            </tr>
            </tbody>
        </table>
    </div>
    <div class="row float-right">
        <button type="button" class="btn btn-success">Оплатить</button>
    </div>
</div>
</body>
</html>
