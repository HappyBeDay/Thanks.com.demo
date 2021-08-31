/**
 * ajax3.jsp
 */
var httpRequest = null;

// get a browser engine object
function getXmlHttpRequest() {
	if (window.ActiveXObject) {
		try {
			return new ActiveXObject("Msxml2.XMLHTTP");
		} catch (e) {
			// TODO: handle exception
		}
	} else if (window.XMLHttpRequest) {
		return new XMLHttpRequest();
	}
}

// call back function
function view() {
	if (httpRequest.readyState == 4 && httpRequest.status == 200) {
		xmlDom = httpRequest.responseXML;
		// print XML file
		printInfo();
	}
}

// global variable
var xmlDom;
var twitters = [];

// print XML variable
function printInfo() {
	console.log(xmlDom);
	// (root) statuses - "status"
	var status_list = xmlDom.getElementsByTagName("status");
	for (var i = 0; i < status_list.length; i++) {
		// status - childNodes -> status_nodes is array
		var status_nodes = status_list[i].childNodes;
		var twitter = {};
		// process about each childNodes of status.
		for (var x = 0; x < status_nodes.length; x++) {
			var node = status_nodes[x];
			// nodeType == 1 is 'element node' = this is 'Tag'.
			if (node.nodeType == 1) {
				var currentName = node.nodeName;
				// extract nodeName : 'created_at', 'id', 'text'.
				if (currentName == 'created_at' || currentName == 'id' || currentName == 'text') {
					//console.log(currentName + ' ' + node.firstChild.nodeValue);
					twitter[currentName] = node.firstChild.nodeValue;
				} else if (currentName == 'user') {
					// status - user is array data. so we need extract data.
					var user_object = getUserObject(node.childNodes);
					// push array
					twitters.push(user_object);
				}
			}//if
		}// for each status
		twitters.push(twitter);
	}// for all status
	console.log(twitters);
}

// extract of <user> in <status>
function getUserObject(user_nodes) {
	var user_vo = {};
	// process about each user.childNodes data (statuses - status - user - childNodes)
	for (var i = 0; i < user_nodes.length; i++) {
		var node = user_nodes[i];
		if (node.nodeType == 1) {
			// we need extract 'id', 'name', 'screen_name', 'location' of <user>.
			if (node.nodeName == 'id' || node.nodeName == 'name' || node.nodeName == 'screen_name'
				|| node.nodeName == 'location') {
				user_vo[node.nodeName] = node.firstChild.nodeValue;
			}//if
		}//if
	}//for
	//extract array data
	return user_vo;
}

// button click event
function load(obj) {
	//get a browser engine object
	httpRequest = getXmlHttpRequest();
	
	url = "/Thanks.com/xml/";
	var xmlFileName = obj.value;
	
	httpRequest.onreadystatechange = view; // callback function is "view"
	httpRequest.open('GET', url+xmlFileName, true);
	httpRequest.send(null);
}