/**
 * 
 * @param _selector
 * @returns
 */
if (typeof jQuery === "undefined") {
  throw new Error("C&H Cloud requires jQuery");
}

function LogOutTest(_selector){
	
	$("#"+_selector).click(function(){
		console.log("Logout Btn Click");
	})
	
}