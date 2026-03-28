<html>
<body>

<h1>Java Server Pages</h1>

<button onclick="loadPage()">Click Me</button>

<div id="content"></div>

<script>
    function loadPage(){
        fetch("index.html")
            .then(response => response.text())
            .then(data => {
                document.getElementById("content").innerHTML = data;
            });
    }
</script>

</body>
</html>