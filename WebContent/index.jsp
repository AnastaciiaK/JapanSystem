<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Japan System</title>
        <script src="http://code.jquery.com/jquery-latest.min.js"></script>
        
        <script>
            $(document).on("click", "#somebutton", function() { 
                $.get("JapanSystem", function(responseText) {   
                    $("#somediv").text(responseText); 
                    var input = document.createElement("input");
                    input.id="userAnswer";
                    input.setAttribute('type',"text");
                    input.setAttribute('name',"username");
                    input.setAttribute('value',"default");
                    //input.className = "css-class-name"; // set the CSS class
                    container.appendChild(input); // put it into the DOM
                });
            });
        </script>
    </head>
    <body>
        <button id="somebutton">press here</button>
        <div id="somediv"></div>
    </body>
</html>