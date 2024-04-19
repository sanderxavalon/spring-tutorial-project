<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class="h-100">

	<%@include file="/component/HTMLHeader.jsp" %>

		
	
	<body class="d-flex flex-column h-100">
	<%@include file="component/StickyHeader.jsp" %>
		<main>
			<section class="py-5 text-center container">
				<div class="row py-lg-5">
					<div class="col-lg-6 col-md-8 mx-auto">
						<h1 class="fw-light">Album example</h1>
						<p class="lead text-body-secondary">Something short and leading about the collection below—its
							contents, the creator, etc. Make it short and sweet, but not too short so folks don’t simply
							skip over it entirely.</p>
					</div>
				</div>
			</section>
			<div class="album py-5 bg-body-tertiary">
				<div class="container">
					<div class="row row-cols-1 row-cols-sm-2 row-cols-md-2 g-3">
						<div class="col">
							<div class="card shadow-sm">
								<svg class="bd-placeholder-img card-img-top" width="100%" height="225"
									xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail"
									preserveAspectRatio="xMidYMid slice" focusable="false">
									<title>Placeholder</title>
									<rect width="100%" height="100%" fill="#55595c"></rect><text class="heavy" x="50%"
										y="50%" fill="#eceeef" dy=".3em">Tutorial</text>
								</svg>
								<div class="card-body">
									<p class="card-text">This is a wider card with supporting text below as a natural
										lead-in to additional content. This content is a little bit longer.</p>
								</div>
							</div>
						</div>
						<div class="col">
							<div class="card shadow-sm">
								<svg class="bd-placeholder-img card-img-top" width="100%" height="225"
									xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail"
									preserveAspectRatio="xMidYMid slice" focusable="false">
									<title>Placeholder</title>
									<rect width="100%" height="100%" fill="#55595c"></rect><text class="heavy" x="50%"
										y="50%" fill="#eceeef" dy=".3em">Lab</text>
								</svg>
								<div class="card-body">
									<p class="card-text">This is a wider card with supporting text below as a natural
										lead-in to additional content. This content is a little bit longer.</p>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</main>
	</body>
	
		<%@include file="/component/StickyFooter.jsp" %>
	
	</body>

</html>