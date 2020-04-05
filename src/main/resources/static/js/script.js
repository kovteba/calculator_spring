$(document).ready(function () {

    var zero = document.getElementById("zero");
    var one = document.getElementById("one");
    var two = document.getElementById("two");
    var three = document.getElementById("three");
    var four = document.getElementById("four");
    var five = document.getElementById("five");
    var six = document.getElementById("six");
    var seven = document.getElementById("seven");
    var eight = document.getElementById("eight");
    var nine = document.getElementById("nine");

    var point = document.getElementById("point");

    var leftBracket = document.getElementById("leftBracket");
    var rightBracket = document.getElementById("rightBracket");

    var division = document.getElementById("division");
    var multiplication = document.getElementById("multiplication");
    var plus = document.getElementById("plus");
    var minus = document.getElementById("minus");

    var inputValue = document.getElementById("inputValue");
    var resultValue = document.getElementById("resultValue");

    var before = "";

    $("#zero").click(function (e) {
        var value = inputValue.value;
        value = value + zero.value;
        inputValue.setAttribute("value", value);
    });
    $("#one").click(function (e) {
        var value = inputValue.value;
        value = value + one.value;
        inputValue.setAttribute("value", value);
    });
    $("#two").click(function (e) {
        var value = inputValue.value;
        value = value + two.value;
        inputValue.setAttribute("value", value);
    });
    $("#three").click(function (e) {
        var value = inputValue.value;
        value = value + three.value;
        inputValue.setAttribute("value", value);
    });
    $("#four").click(function (e) {
        var value = inputValue.value;
        value = value + four.value;
        inputValue.setAttribute("value", value);
    });
    $("#five").click(function (e) {
        var value = inputValue.value;
        value = value + five.value;
        inputValue.setAttribute("value", value);
    });
    $("#six").click(function (e) {
        var value = inputValue.value;
        value = value + six.value;
        inputValue.setAttribute("value", value);
    });
    $("#seven").click(function (e) {
        var value = inputValue.value;
        value = value + seven.value;
        inputValue.setAttribute("value", value);
    });
    $("#eight").click(function (e) {
        var value = inputValue.value;
        value = value + eight.value;
        inputValue.setAttribute("value", value);
    });
    $("#nine").click(function (e) {
        var value = inputValue.value;
        value = value + nine.value;
        inputValue.setAttribute("value", value);
    });

    $("#point").click(function (e) {
        var value = inputValue.value;
        value = value + point.value;
        inputValue.setAttribute("value", value);
    });

    $("#division").click(function (e) {
        var value = inputValue.value;
        value = value + division.value;
        inputValue.setAttribute("value", value);
    });
    $("#multiplication").click(function (e) {
        var value = inputValue.value;
        value = value + multiplication.value;
        inputValue.setAttribute("value", value);
    });
    $("#minus").click(function (e) {
        var value = inputValue.value;
        value = value + minus.value;
        inputValue.setAttribute("value", value);
    });
    $("#plus").click(function (e) {
        var value = inputValue.value;
        value = value + plus.value;
        inputValue.setAttribute("value", value);
    });

    $("#leftBracket").click(function (e) {
        var value = inputValue.value;
        value = value + leftBracket.value;
        inputValue.setAttribute("value", value);
    });
    $("#rightBracket").click(function (e) {
        var value = inputValue.value;
        value = value + rightBracket.value;
        inputValue.setAttribute("value", value);
    });

    $("#clear").click(function (e) {
        before = inputValue.value;
        inputValue.setAttribute("value", " ");
        resultValue.setAttribute("value", " ");
    });

    $("#redo").click(function (e) {
        inputValue.setAttribute("value", before);
    });

});
