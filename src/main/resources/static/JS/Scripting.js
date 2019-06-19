function selectCharacterClass(id) {
	
  var all = document.getElementsByClassName('gallery');
  for (var i = 0; i < all.length; i++){
    all[i].style.border = "none";
   }
   document.getElementById(id).style.border = "solid #DC143C";
}
