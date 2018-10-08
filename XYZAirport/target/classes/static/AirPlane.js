function getData() {
    // Get the data from endpoint.
    $.ajax({
        url:"http://localhost:8080/api/airplane/",
        type:"get",
        success: function(airplanes) {
            // On successful get, reload the datatable with new data.
            console.log("This is the data: " + airplanes);
            $('#airplaneTable').DataTable().clear();
            $('#airplaneTable').DataTable().rows.add(airplanes);
            $('#airplaneTable').DataTable().columns.adjust().draw();
        }
    });
}

function addFuel(planeID) {
    console.log("plane id: " + planeID);

    $.ajax({
        url:"http://localhost:8080/api/airplane/" + planeID,
        type:"put",
        success: function(result) {
            console.log("success add fuel data!");
            getData();
        }
    });
}

$(document).ready(function () {


    // Load DataTable with data format.
    $('#airplaneTable').DataTable({
        columns: [
            { "data": "id" },
            { "data": "currentFuel" },
            { "data": function() {
                    return '<button onclick="addFuel(this.parentElement.parentElement.children[0].innerText)" type="button" class="btn btn-danger">Add fuel</button>' }}
        ]
    });

    // Load first data.
    getData();
});