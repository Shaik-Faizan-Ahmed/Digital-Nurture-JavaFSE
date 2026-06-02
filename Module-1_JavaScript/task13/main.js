const form=document.getElementById("registrationForm");
const message=document.getElementById("message");

form.addEventListener("submit",async function(event){

    event.preventDefault();

    console.log("Form Submitted");

    const name=document.getElementById("name").value;
    const email=document.getElementById("email").value;

    console.log("Name:",name);
    console.log("Email:",email);

    debugger;

    const userData={
        name:name,
        email:email
    };

    console.log("Payload:",userData);

    try{

        const response=await fetch(
            "https://jsonplaceholder.typicode.com/posts",
            {
                method:"POST",
                headers:{
                    "Content-Type":"application/json"
                },
                body:JSON.stringify(userData)
            }
        );

        console.log("Response Status:",response.status);

        if(response.ok){

            message.innerText=
            "Registration Successful";

            console.log("Registration Successful");
        }
        else{

            message.innerText=
            "Registration Failed";

            console.log("Registration Failed");
        }

    }
    catch(error){

        console.log("Error:",error);

        message.innerText=
        "Server Error";
    }

});