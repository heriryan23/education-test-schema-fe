<html>

<head>
    <script type="text/javascript">
        function validation() {
            var validasiHuruf = /^[a-zA-Z ]+$/;
            var nama = document.getElementById("nama");
            if (nama.value.match(validasiHuruf)) {
                alert("Sistem memeriksa data anda valid dengan ketentuan kami dengan inputan hallo " + nama.value + " selamat datang!");
            } else {
                alert("Sistem kami menolak untuk inputan berisi angka");
                nama.value = "";
                nama.focus();
                return false;
            }
        }
    </script>
</head>

<body>

    Nama:<br>
    <input type="text" id="nama">
    <button onclick="validation()"> cek </button>

</body>

</html>