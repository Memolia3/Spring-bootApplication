//use in Ready.html
function clickBtn1(value){
	console.log(value + "を選択");
}

//use in Battle.html
const characterName = /*[[${select}]]*/"select";

function clickBtn2(action){
	console.log(action + "を実行");
	switch(action){
		case "こうげき":
			console.log(action + "のメソッドを実行");
			//return attack();
			break;
		case "まもる":
			console.log(action + "のメソッドを実行");
			//return gard();
			break;
		case "ようすをみる":
			console.log(action + "のメソッドを実行");
			//return see();
			break;
	}
	const describe = document.getElementById("describe");
	describe.style.display = "flex";
	describe.style.justifyContent = "center";
	describe.style.position = "absolute";
	describe.style.top = "75%";
}