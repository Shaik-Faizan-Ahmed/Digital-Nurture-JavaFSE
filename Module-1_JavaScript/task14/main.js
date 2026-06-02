$(document).ready(function(){

    $("#registerBtn").click(function(){

        $("#message").text(
            "Registration Successful"
        );
    });

    $("#hideBtn").click(function(){

        $("#eventCard").fadeOut();
    });

    $("#showBtn").click(function(){

        $("#eventCard").fadeIn();
    });

});

console.log(
    "React and Vue make large applications easier to manage using reusable components."
);