<!DOCTYPE html>
<html>
<head>
 <meta charset="utf-8">
 <meta name="viewport" content="width=device-width, initial-scale=1">
 <title></title>
</head>
<body>
 <script type="text/javascript">
  var rand=Math.floor((Math.random()*10)+1);
  var num=window.prompt("Please enter a number from 1 to 10");
  

  while(true){if(num==rand){

  alert("Your guess is correct. The number is "+""+rand+"")
  break
         }
     else {var num=window.prompt("Your guess is incorrect. Please enter a number from 1 to 10 again.");
                      }}



 </script>

</body>
</html>