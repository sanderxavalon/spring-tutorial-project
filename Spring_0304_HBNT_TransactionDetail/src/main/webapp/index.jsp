<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
	<!DOCTYPE html>
	<html class="h-100">

	<%@include file="/component/HTMLHeader.jsp" %>

		<body class="d-flex flex-column h-100">
			<%@include file="component/StickyHeader.jsp" %>
			<style>
				.row {
					margin-top: 30px
				}
			</style>
			<main class="flex-shrink-0">
				<div class="container">
					<div class="row">
						<div class="col">
							<div class="row">
								<h3>ReadOnly設定詳細</h3>
								<div class="list-group">
									<a class="list-group-item list-group-item-action list-group-item-info"
										href="${pageContext.request.contextPath}/dept/getAll">@Transaction有ReadOnly的情況</a>
									<a class="list-group-item list-group-item-action"
										href="${pageContext.request.contextPath}/dept/getAllWithoutReadOnly">@Transaction沒有ReadOnly的情況</a>
								</div>
							</div>
							<div class="row">
								<h3>Rollback for與No Rollback for設定詳細</h3>
								<div class="list-group">
									<a class="list-group-item list-group-item-action list-group-item-info"
										href="${pageContext.request.contextPath}/dept/saveWithRuntimeException">RuntimeException - 拋出會Rollback</a>
									<a class="list-group-item list-group-item-action"
										href="${pageContext.request.contextPath}/dept/saveNoRollBack">RuntimeException - 設定No-Rollback-For後，拋出不會Rollback</a>
									<a class="list-group-item list-group-item-action list-group-item-info"
										href="${pageContext.request.contextPath}/dept/exceptionNoRollBack">非RuntimeException - 拋出不會Rollback</a>
									<a class="list-group-item list-group-item-action"
										href="${pageContext.request.contextPath}/dept/saveRollBackFor">非RuntimeException - 設定Rollback-For後，拋出不Rollback</a>
								</div>
							</div>
						</div>
						<div class="col">
							<div class="row">
								<h3>Timeout設定詳細</h3>
								<div class="list-group">
									<a class="list-group-item list-group-item-action list-group-item-success"
										href="${pageContext.request.contextPath}/dept/saveTimeOut">@Transaction設定1秒的Timeout時間限制</a>
								</div>
							</div>
							<div class="row">
								<h3>傳播行為</h3>
								<div class="list-group">
									<a class="list-group-item list-group-item-action list-group-item-success"
										href="${pageContext.request.contextPath}/dept/propagation/required">
										<div class="d-flex w-100 justify-content-between">
											<h5 class="mb-1">Propagation.REQUIRED</h5>
										</div>
										<p class="mb-1">支援現在的交易，如果沒有的話就建立一個新的交易</p>
									</a>
									<a class="list-group-item list-group-item-action "
										href="${pageContext.request.contextPath}/dept/propagation/requirednew">
										<div class="d-flex w-100 justify-content-between">
											<h5 class="mb-1">Propagation.REQUIRES_NEW</h5>
										</div>
										<p class="mb-1">建立一個新的交易，如果現存一個交易的話就先暫停，並啟始一個新的交易</p>
									</a>
									<a class="list-group-item list-group-item-action list-group-item-success"
										href="${pageContext.request.contextPath}/dept/propagation/never">
										<div class="d-flex w-100 justify-content-between">
											<h5 class="mb-1">Propagation.NEVER</h5>
										</div>
										<p class="mb-1">指出不應在交易中進行，如果有的話就丟出例外</p>
									</a>
									<a class="list-group-item list-group-item-action "
										href="${pageContext.request.contextPath}/dept/propagation/mandatory">
										<div class="d-flex w-100 justify-content-between">
											<h5 class="mb-1">Propagation.MANDATORY</h5>
										</div>
										<p class="mb-1">方法必須在一個現存的交易中進行，否則丟出例外</p>
									</a>
									<a class="list-group-item list-group-item-action list-group-item-success"
										href="${pageContext.request.contextPath}/dept/propagation/support">
										<div class="d-flex w-100 justify-content-between">
											<h5 class="mb-1">Propagation.SUPPORT</h5>
										</div>
										<p class="mb-1">支援現在的交易，如果沒有的話就以非交易的方式執行</p>
									</a>
									<a class="list-group-item list-group-item-action "
										href="${pageContext.request.contextPath}/dept/propagation/notsupport">
										<div class="d-flex w-100 justify-content-between">
											<h5 class="mb-1">Propagation.NOTSUPPORTED</h5>
										</div>
										<p class="mb-1">指出不應在交易中進行，如果有的話就暫停現存的交易</p>
									</a>
									<a class="list-group-item list-group-item-action list-group-item-success"
										href="${pageContext.request.contextPath}/dept/propagation/nest">
										<div class="d-flex w-100 justify-content-between">
											<h5 class="mb-1">Propagation.NEST</h5>
										</div>
										<p class="mb-1">觀測再正常情況下與REQUIRES_NEW commit時機點差異</p>
									</a>
									<a class="list-group-item list-group-item-action list-group-item-dark"
										href="${pageContext.request.contextPath}/dept/propagation/savewithtrycatch">
										<div class="d-flex w-100 justify-content-between">
											<h5 class="mb-1">Propagation.REQUIRES_NEW</h5>
										</div>
										<p class="mb-1">觀測再正常情況下與Propagation.NEST時機點差異</p>
									</a>
									<a class="list-group-item list-group-item-action list-group-item-dark"
										href="${pageContext.request.contextPath}/dept/propagation/nestwithtrycatch">
										<div class="d-flex w-100 justify-content-between">
											<h5 class="mb-1">Propagation.NEST</h5>
										</div>
										<p class="mb-1">內嵌交易可以被try-catch，不會影響到父交易</p>
									</a>
								</div>
							</div>
						</div>
					</div>
				</div>
			</main>

			<%@include file="/component/StickyFooter.jsp" %>

		</body>

	</html>