<!--
/*
* � Copyright IBM Corp. 2013
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at:
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
* implied. See the License for the specific language governing
* permissions and limitations under the License.
*/ -->

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@page import="com.ibm.commons.runtime.Application"%>
<%@page import="com.ibm.commons.runtime.Context"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="com.ibm.sbt.services.client.connections.forums.ForumService"%>
<%@page import="com.ibm.sbt.services.client.connections.forums.Forum"%>
<%@page	import="com.ibm.sbt.services.client.connections.forums.ForumList"%>
<%@page import="com.ibm.sbt.services.client.connections.forums.Tag"%>
<%@page	import="com.ibm.sbt.services.client.connections.forums.TagList"%>
<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<title>SBT JAVA Sample - Forums Tags</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
	<%
		try {
			ForumService svc = new ForumService();
			ForumList forums = svc.getPublicForums();
			String forumId = forums.get(0).getUid();
		
			TagList tags = svc.getForumTopicsTags(forumId);
			if (tags.size() <= 0) {
				out.println("No tags to be displayed");
			}
			for (Tag tag : tags) {
				out.println("<b>Tag : </b> " + tag.getTerm());
				out.println("<b>Tag Frequency: </b> " + tag.getFrequency());
				out.println("<b>Tag Visibility :</b> "+ tag.getVisibility());
				out.println("<b>Tag Intensity :</b> " + tag.getIntensity());
				out.println("<br>");
			}
		} catch (Throwable e) {
			out.println("<pre>");
			out.println(e.getMessage());
			out.println("</pre>");
		}
	%>
</body>
</html>