const form=document.getElementById("registrationForm");

form.addEventListener("submit",function(event){

    event.preventDefault();

    const name=form.elements["name"].value.trim();
    const email=form.elements["email"].value.trim();
    const selectedEvent=form.elements["event"].value;

    const error=document.getElementById("error");
    const success=document.getElementById("success");

    error.innerText="";
    success.innerText="";

    if(name===""){
        error.innerText="Name is required";
        return;
    }

    if(email===""){
        error.innerText="Email is required";
        return;
    }

    if(selectedEvent===""){
        error.innerText="Please select an event";
        return;
    }

    success.innerText=
    `Registration Successful for ${selectedEvent}`;
});