const events=[
    {
        name:"Music Night",
        category:"Music",
        location:"Hyderabad"
    },
    {
        name:"Coding Workshop",
        category:"Workshop",
        location:"Vijayawada"
    },
    {
        name:"Dance Show",
        category:"Dance",
        location:"Guntur"
    }
];

function displayMessage(message="Welcome to Community Portal"){
    return message;
}

function showEventDetails(){

    const{name,category,location}=events[0];

    let result="";

    result+=`<h3>${displayMessage()}</h3>`;

    result+=`
        Event Name: ${name}<br>
        Category: ${category}<br>
        Location: ${location}<br>
    `;

    document.getElementById("output").innerHTML=result;
}

function showMusicEvents(){

    const clonedEvents=[...events];

    const musicEvents=clonedEvents.filter(
        event=>event.category==="Music"
    );

    let result="<h3>Music Events</h3>";

    musicEvents.forEach(event=>{
        result+=`${event.name}<br>`;
    });

    document.getElementById("output").innerHTML=result;
}