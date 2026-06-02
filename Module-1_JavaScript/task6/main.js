let events=[
    {
        name:"Music Night",
        category:"Music"
    },
    {
        name:"Coding Workshop",
        category:"Workshop"
    },
    {
        name:"Dance Show",
        category:"Dance"
    }
];

function addNewEvent(){

    events.push({
        name:"Guitar Workshop",
        category:"Music"
    });

    alert("New Event Added");
}

function showMusicEvents(){

    let musicEvents=events.filter(event=>
        event.category==="Music"
    );

    let result="<h3>Music Events</h3>";

    musicEvents.forEach(event=>{
        result+=`${event.name}<br>`;
    });

    document.getElementById("output").innerHTML=result;
}

function showEventCards(){

    let cards=events.map(event=>
        `Workshop on ${event.name}`
    );

    let result="<h3>Event Cards</h3>";

    cards.forEach(card=>{
        result+=`${card}<br>`;
    });

    document.getElementById("output").innerHTML=result;
}