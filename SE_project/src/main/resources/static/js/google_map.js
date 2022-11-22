// window.initMap = function () {
//     const map = new google.maps.Map(document.getElementById("map"), {
//         center: { lat: 35.8306426, lng: 128.7545109 },
//         zoom: 10,
//     });


//     const malls = [
//         { label: "C", name: "중앙도서관", lat: 35.8330014, lng: 128.75831 },
//     ];

//     const bounds = new google.maps.LatLngBounds();
//     const infowindow = new google.maps.InfoWindow();

//     malls.forEach(({ label, name, lat, lng }) => {
//         const marker = new google.maps.Marker({
//             position: { lat, lng },
//             label,
//             map: map,
//         });
//         bounds.extend(marker.position);

//         marker.addListener("click", () => {
//             map.panTo(marker.position);
//             infowindow.setContent(name);
//             infowindow.open({
//                 anchor: marker,
//                 map,
//             });
//         });
//     });

//     map.fitBounds(bounds);
// };

let map, infoWindow;

function initMap() {
    map = new google.maps.Map(document.getElementById("map"), {
        center: { lat: 35.8306426, lng: 128.7545109 },
        zoom: 17,
    });
    infoWindow = new google.maps.InfoWindow();

    const locationButton = document.createElement("button");

    locationButton.textContent = "Pan to Current Location";
    locationButton.classList.add("custom-map-control-button");
    map.controls[google.maps.ControlPosition.TOP_CENTER].push(locationButton);
    locationButton.addEventListener("click", () => {
        // Try HTML5 geolocation.
        if (navigator.geolocation) {
            navigator.geolocation.getCurrentPosition(
                (position) => {
                    const pos = {
                        lat: position.coords.latitude,
                        lng: position.coords.longitude,
                    };

                    infoWindow.setPosition(pos);
                    infoWindow.setContent("Location found.");
                    infoWindow.open(map);
                    map.setCenter(pos);
                },
                () => {
                    handleLocationError(true, infoWindow, map.getCenter());
                }
            );
        } else {
            // Browser doesn't support Geolocation
            handleLocationError(false, infoWindow, map.getCenter());
        }
    });
}

function handleLocationError(browserHasGeolocation, infoWindow, pos) {
    infoWindow.setPosition(pos);
    infoWindow.setContent(
        browserHasGeolocation
            ? "Error: The Geolocation service failed."
            : "Error: Your browser doesn't support geolocation."
    );
    infoWindow.open(map);
}

window.initMap = initMap;