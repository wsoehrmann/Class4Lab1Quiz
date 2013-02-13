<%-- 
    Document   : index
    Created on : Feb 11, 2013, 5:42:05 PM
    Author     : wsoehrmann
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculation Page Lab1 quiz</title>
    </head>
    <body>
        <h1>Various object size calculator</h1>
    </body>


    <title>This is the lab to calculate the area of a rectangle,
        the radius of a circle or the third leg of a triangle</title>
    <script type="text/javascript">
            
        function validateRect(){
            if(length == null || length < 0){
                alert("Please enter a valid number");
                return false;
            }
            else if (width == null || width < 0){
                alert("Please enter a valid number");
                return false
            }else{
                return true;
            }
                    
                    
    </script>

</head>
<body>
    <h1>Enter the length and width of the rectangle</h1>
    <form  id="rectform" name="rectForm" method="POST "action="CalculationController" onsubmit="return validateRect()">  


        length:<input type="text" name="length"><br>
        width:<input type="text" name="width">

        <input type="submit" value="Submit" />


    </form>


    <script type="text/javascript">
            
            
            function validateCircle(){
                if(radius == null || length < 0){
                    alert ("Please enter a valid number");
                    return false;
                }else{
                    return true;
                }
            }
    </script>

    <h1>Enter the radius of a circle</h1>  

    <form  id="raidform" name="raidForm" method="POST"action="CalculationController" onsubmit="return validateCircle()"     >  

        radius:<input type="text"name= "radius">

        <input type="submit" value="Submit" />


    </form>


    <h1>Enter First and second legs of a triangle</h1>
    <script type="text/javacript">

        function validateFirstTwoLegs(){
        if (firstleg == null || length < 0){
        alert ("Please enter a valid number");RequestDispatcher view =
                request.getRequestDispatcher(destination);
        view.forward(request, response);
        return false;
        }{else if (secondleg == null || length < 0){
        alert ("Please enter a valid number");
        return false;
        }else{
        return true:
        }

    </script>

    <form  id="triangform" name="triangForm" method="POST"action="CalculationController"nsubmit="return validateFirstTwoLegs()" >
        firstleg :<input type="text" name="firstleg"><br>
        secondleg :<input type="text"name="secondleg">

        <input type="submit" value="Submit" />


    </form>



</html>
