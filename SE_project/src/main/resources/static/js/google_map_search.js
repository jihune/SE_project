let map, infoWindow;

function initMap() {
    map = new google.maps.Map(document.getElementById("map"), {
        center: { lat: 35.8306426, lng: 128.7545109 },
        zoom: 17,
    });
    infoWindow = new google.maps.InfoWindow();

    const searchBox = new google.maps.places.SearchBox(input);

    searchBox.addListener("places_changed", () => {
        //이벤트 발생 시 getPlaces()를 통해 place객체 배열을 가져온다
        const places = searchBox.getPlaces();
        //검색 결과가 없는 경우이다
        if (places.length == 0) {
            return;
        }
        //첫 번째 값을 가져와 사용한다
        const place = places[0];
        //input에 해당 장소의 이름을 출력해준다
        input.value = place.name;
        //해당 장소가 위치 정보가 없는 경우이다
        if (!place.geometry || !place.geometry.location) {
            console.log("Returned place contains no geometry");
            return;
        }
        //검색한 장소로 지도를 이동시킨다
        if (place.geometry.viewport) {
            map.fitBounds(place.geometry.viewport);
        } else {
            map.setCenter(place.geometry.location);
            map.setZoom(17);
        }
    });
    const infowindow = new google.maps.InfoWindow();
    const infowindowContent = document.getElementById("infowindow-content");

    infowindow.setContent(infowindowContent);
    const marker = new google.maps.Marker({
        map,
        anchorPoint: new google.maps.Point(0, -29),
    });

    searchBox.addListener("places_changed", () => {
        //위 코드 생략

        marker.setPosition(place.geometry.location);
        marker.setVisible(false);
        map.setZoom(15);
        infowindowContent.children["place-name"].textContent = place.name;
        infowindowContent.children["place-address"].textContent = place.formatted_address;
        infowindow.open(map, marker);
    });
}

// function handleLocationError(browserHasGeolocation, infoWindow, pos) {
//     infoWindow.setPosition(pos);
//     infoWindow.setContent(
//         browserHasGeolocation
//             ? "Error: 위치인증에 실패 하였습니다."
//             : "Error: 연결상태를 확인해 주세요."
//     );
//     infoWindow.open(map);
// }

window.initMap = initMap;