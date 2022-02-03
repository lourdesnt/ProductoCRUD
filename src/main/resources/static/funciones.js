function eliminar(ref) {
	console.log(ref);
	swal({
		title: "¿Está seguro de querer eliminar el producto?",
		text: "Una vez eliminado no se podrá restablecer",
		icon: "warning",
		buttons: true,
		dangerMode: true,
	})
	.then((OK) => {
		if (OK) {
			$.ajax({
			url:"/eliminar/"+ref,
			success: function(res) {
				console.log(res);
			},
	});
	swal("El producto ha sido eliminado", {
		icon: "success",
	}).then((ok)=>{
		if(ok){
			location.href="/carrito";
		}
	});
	}
});

}