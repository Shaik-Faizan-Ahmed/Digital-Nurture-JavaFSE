const events=[
    {
        name:"Music Night",
        seats:20
    },
    {
        name:"Coding Workshop",
        seats:15
    },
    {
        name:"Dance Show",
        seats:10
    }
];

const container=document.querySelector("#eventContainer");

function displayEvents(){

    container.innerHTML="";

    events.forEach(event=>{

        const card=document.createElement("div");

        const title=document.createElement("h3");
        title.textContent=event.name;

        const seats=document.createElement("p");
        seats.textContent=`Available Seats: ${event.seats}`;

        const registerBtn=document.createElement("button");
        registerBtn.textContent="Register";

        registerBtn.onclick=function(){

            if(event.seats>0){
                event.seats--;
                displayEvents();
            }
        };

        const cancelBtn=document.createElement("button");
        cancelBtn.textContent="Cancel Registration";

        cancelBtn.onclick=function(){

            event.seats++;
            displayEvents();
        };

        card.appendChild(title);
        card.appendChild(seats);
        card.appendChild(registerBtn);
        card.appendChild(cancelBtn);

        container.appendChild(card);
    });
}

displayEvents();