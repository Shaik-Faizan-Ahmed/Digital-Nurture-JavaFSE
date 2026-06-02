const events=[
    {
        name:"Music Night",
        category:"Music",
        seats:20
    },
    {
        name:"Coding Workshop",
        category:"Workshop",
        seats:15
    },
    {
        name:"Dance Show",
        category:"Dance",
        seats:10
    }
];

const container=document.getElementById("eventContainer");

function displayEvents(eventList){

    container.innerHTML="";

    eventList.forEach(event=>{

        const card=document.createElement("div");

        card.innerHTML=`
            <h3>${event.name}</h3>
            <p>Category: ${event.category}</p>
            <p>Seats: ${event.seats}</p>
            <button onclick="registerUser('${event.name}')">
                Register
            </button>
            <hr>
        `;

        container.appendChild(card);
    });
}

function registerUser(eventName){

    alert(`Registered for ${eventName}`);
}

displayEvents(events);

document.getElementById("category").onchange=function(){

    const category=this.value;

    if(category==="All"){
        displayEvents(events);
    }
    else{

        const filtered=events.filter(
            event=>event.category===category
        );

        displayEvents(filtered);
    }
};

document.getElementById("searchBox").onkeydown=function(){

    const text=this.value.toLowerCase();

    const filtered=events.filter(
        event=>event.name.toLowerCase().includes(text)
    );

    displayEvents(filtered);
};