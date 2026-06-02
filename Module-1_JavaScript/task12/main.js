const form=document.getElementById("registrationForm");
const message=document.getElementById("message");

form.addEventListener("submit",function(event){

    event.preventDefault();

    const name=document.getElementById("name").value;
    const email=document.getElementById("email").value;

    message.innerText="Submitting...";

    setTimeout(async function(){

        try{

            const response=await fetch(
                "https://jsonplaceholder.typicode.com/posts",
                {
                    method:"POST",
                    headers:{
                        "Content-Type":"application/json"
                    },
                    body:JSON.stringify({
                        name:name,
                        email:email
                    })
                }
            );

            if(response.ok){

                message.innerText=
                "Registration Successful";
            }
            else{

                message.innerText=
                "Registration Failed";
            }

        }
        catch(error){

            message.innerText=
            "Error Connecting to Server";

            console.log(error);
        }

    },2000);

});