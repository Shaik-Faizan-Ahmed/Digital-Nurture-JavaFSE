const events=[
    {
        name:"Music Night",
        date:"2027-01-15",
        seats:20
    },
    {
        name:"Dance Show",
        date:"2024-01-10",
        seats:30
    },
    {
        name:"Coding Workshop",
        date:"2027-02-20",
        seats:0
    }
];

const eventDiv=document.getElementById("events");

events.forEach(event=>{

    if(new Date(event.date)>new Date() && event.seats>0){

        eventDiv.innerHTML+=`
            <p>
                ${event.name}
                <button onclick="registerUser('${event.name}')">
                    Register
                </button>
            </p>
        `;
    }
    else{

        eventDiv.innerHTML+=`
            <p>${event.name} (Not Available)</p>
        `;
    }
});

function registerUser(eventName){

    try{

        const event=events.find(e=>e.name===eventName);

        if(!event){
            throw new Error("Event not found");
        }

        if(event.seats<=0){
            throw new Error("No seats available");
        }

        event.seats--;

        alert(`Registration Successful\nRemaining Seats: ${event.seats}`);

    }
    catch(error){

        alert(error.message);
        console.error(error);
    }
}