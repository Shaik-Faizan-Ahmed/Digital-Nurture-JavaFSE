const loading=document.getElementById("loading");
const container=document.getElementById("eventContainer");

function displayEvents(events){

    container.innerHTML="";

    events.forEach(event=>{

        container.innerHTML+=`
            <h3>${event.title}</h3>
        `;
    });
}

function loadEventsWithPromises(){

    loading.innerText="Loading Events...";

    fetch("https://jsonplaceholder.typicode.com/posts?_limit=5")
    .then(response=>response.json())
    .then(data=>{

        loading.innerText="";

        displayEvents(data);
    })
    .catch(error=>{

        loading.innerText="Failed to Load Events";

        console.log(error);
    });
}

async function loadEventsAsync(){

    try{

        loading.innerText="Loading Events...";

        const response=await fetch(
            "https://jsonplaceholder.typicode.com/posts?_limit=5"
        );

        const data=await response.json();

        loading.innerText="";

        displayEvents(data);
    }
    catch(error){

        loading.innerText="Failed to Load Events";

        console.log(error);
    }
}