function moveEventDetails(x) {
	var form = document.createElement('form');
	form.action = "/event/details/" + x;
	form.method = 'get';
	document.body.appendChild(form);
	form.submit();
}

// ユーザの詳細ページに遷移
function moveUserDetails(x) {
	var form = document.createElement('form');
	form.action = "/users/" + x;
	form.method = 'get';
	document.body.appendChild(form);
	form.submit();
}

// ヘッダーのトップページに遷移
function moveTop() {
	var form = document.createElement('form');
	form.action = "/top";
	form.method = 'get';
	document.body.appendChild(form);
	form.submit();
}

function moveTop2() {
	var form = document.createElement('form');
	form.action = "/";
	form.method = 'get';
	document.body.appendChild(form);
	form.submit();
}

// ヘッダーのお知らせページに遷移
function moveInfomation() {
	var form = document.createElement('form');
	form.action = "/infomation";
	form.method = 'get';
	document.body.appendChild(form);
	form.submit();
}

// ヘッダーのメンバーページに遷移
function moveMember() {
	var form = document.createElement("form");
	form.action = "/member";
	form.method = "get";
	document.body.appendChild(form);
	form.submit();
}

// ヘッダーのマイページへ遷移
function moveMypage() {
	var form = document.createElement("form");
	form.action = "/mypage";
	form.method = "get";
	document.body.appendChild(form);
	form.submit();
}

//ログインページに遷移
function moveLogin() {
	var form = document.createElement('form');
	form.action = "/login";
	form.method = 'get';
	document.body.appendChild(form);
	form.submit();
}

//ログアウトする
function logout() {
	var form = document.createElement('form');
	form.action = "/";
	form.method = 'post';
	document.body.appendChild(form);
	form.submit();
}