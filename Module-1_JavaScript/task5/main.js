function Event(name,date,category,seats){

    this.name=name;
    this.date=date;
    this.category=category;
    this.seats=seats;
}

Event.prototype.checkAvailability=function(){

    if(this.seats>0){
        return "Seats Available";
    }
    else{
        return "House Full";
    }
};

const event1=new Event(
    "Music Night",
    "15-Jan-2027",
    "Music",
    20
);

function showDetails(){

    let result="";

    result+="<h3>Event Details</h3>";

    result+=`Name: ${event1.name}<br>`;
    result+=`Date: ${event1.date}<br>`;
    result+=`Category: ${event1.category}<br>`;
    result+=`Seats: ${event1.seats}<br>`;
    result+=`Status: ${event1.checkAvailability()}<br><br>`;

    result+="<h3>Object Keys and Values</h3>";

    Object.entries(event1).forEach(([key,value])=>{

        result+=`${key} : ${value}<br>`;
    });

    document.getElementById("output").innerHTML=result;
}