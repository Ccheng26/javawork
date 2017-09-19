<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page import="com.home.model.QuoteDetails"%>
	<%@ page import="com.home.model.*"%>
	<%@ page import="com.home.bo.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Coverage Details</title>
<link rel="stylesheet" href="./CSS/style.css">
<%	
	int location_id = Integer.parseInt(session.getAttribute("locationId").toString());
	Users user = (Users) session.getAttribute("user");
	int user_id = user.getUserId();
	PropertyDetails property = null;
	PropertyDetailBO propertyBO = new PropertyDetailBO();
	property = propertyBO.getOneLocationId(user_id, location_id);

	LocationAddress location = null;
	LocationAddressBO locationBO = new LocationAddressBO();
	location = locationBO.getOneLocationAddress(user_id, location_id);
	
	QuoteDetails quote = null;
	QuoteDetailBO quoteBO = new QuoteDetailBO();
	quote = quoteBO.getQuoteDetails(user_id);
	
 %>

</head>
<body>
	<div class="container">
		<div class="logintxtsection">
			<img class="stockphoto1" style="width: 300px" alt="home"
				src="http://www.leisepropertyservices.com/wp-content/uploads/2014/12/selling-your-home-cedar-shingle-home11.jpg">
		</div>
		
		<%-- =(String) request.getAttribute("monthly_premium") --%>
		<%-- =(String) request.getAttribute("dwelling_coverage") --%>
		<%-- =(String) request.getAttribute("detached_structures") --%>
		<%-- =(String) request.getAttribute("personal_property") --%>
		<%-- =(String) request.getAttribute("med_exp") --%>
		<%-- =(String) request.getAttribute("add_living_expenses") --%>
		<%-- =(String) request.getAttribute("deductible") --%>
		<%-- =(String) request.getAttribute("issue_date") --%>
		<!-- <%=(String) request.getAttribute("monthly_premium") %>
		<%=(String) request.getAttribute("dwelling_coverage") %>
		<%=(String) request.getAttribute("detached_structures") %>
		<%=(String) request.getAttribute("personal_property") %>
		<%=(String) request.getAttribute("med_exp") %>
		<%=(String) request.getAttribute("add_living_expenses") %>
		<%=(String) request.getAttribute("deductible") %>
		<%=(String) request.getAttribute("issue_date") %> -->

		<a href="homeInsuranceQuote.html">Additional Info</a>
		
		
		<div>
			<table>
				<tr>
					<div class="loginformsection">
				</tr>
				<tr>
					<th>Quote Id</th>
					<td></td>
					<!-- <td>$<%--=quote.getQuoteId()--%></td> -->

				</tr>
				<tr>
					<th>Monthly Premium</th>
					<td><%=quoteBO.makeMonthlyPremium(property.getMarketValue(), location.getResidenceType())%></td>
					<!-- <td><%--=quote.getMonthlyPremium()--%></td> -->
					<!--<td>$<%--=(String) request.getAttribute("monthly_premium")%>--</td-->
				</tr>
				<tr>
					<th>Dwelling Coverage</th>
					<td><%=quoteBO.createDwellingCoverage(property.getSqft(), property.getYearBuilt())%></td>
					<!-- <td>$<%--=quote.getDwellingCoverage()--%></td> -->
				</tr>
				<tr>
					<th>Detached Structure</th>
					<td><%=quoteBO.calcDetachedStructures()%></td>
					<!-- <td>$<%--=quote.getDetachedStructures()--%></td> -->
				</tr>
				<tr>
					<th>Personal Property</th>
					<td><%=quoteBO.calcPersonalProperty()%></td>
					<!-- <td>$<%--=quote.getPersonalProperty()--%></td> -->
				</tr>
				<tr>
					<th>Additional living expense</th>
					<td><%=quoteBO.calcAdditionalLiving()%></td>
					<!-- <td>$<%--=quote.getLivingExpense()--%></td> -->
				</tr>
				<tr>
					<th>Medical expense</th>
					<td><%=quoteBO.calcMedExp()%></td>
					<!-- <td>$<%--=quote.getMedExp()--%></td> -->
				</tr>
				<tr>
					<th>Deductible</th>
					<td><%=quoteBO.calcDeductible()%></td>
					<!-- <td>$<%--=quote.getDeductible()--%></td> -->
				</tr>
				<tr>
				</tr>
			</table>
			<form action="QuoteDetailServlet?action=save" method="post">
					<input type="hidden" name="user_id" value=<%= user.getUserId() %> />
					<input type="hidden" name="monthly_premium" value=<%= quoteBO.makeMonthlyPremium(property.getMarketValue(), location.getResidenceType()) %> />
					<input type="hidden" name="dwelling_coverage" value=<%= quoteBO.createDwellingCoverage(property.getSqft(), property.getYearBuilt()) %> />
					<input type="hidden" name="detached_structures" value=<%= quoteBO.calcDetachedStructures() %> />
					<input type="hidden" name="personal_property" value=<%= quoteBO.calcPersonalProperty() %> />
					<input type="hidden" name="add_living_expenses" value=<%= quoteBO.calcAdditionalLiving() %> />
					<input type="hidden" name="med_exp" value=<%= quoteBO.calcMedExp() %> />
					<input type="hidden" name="deductible" value=<%= quoteBO.calcDeductible() %> />
				<input type="submit" name="Proceed to buy" value="continue" />
			</form>
		</div>
	</div>
</body>
</html>