<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class="h-100">

	<%@include file="/HTMLHeader.jsp" %>
	
	<body class="d-flex flex-column h-100">

		<%@include file="/StickyHeader.jsp" %>
	
	    <main class="flex-shrink-0">
	        <div class="container">
	            <div class="row">
	
	                <div class="col">
	                    <h1>Tutorial</h1>
	                    <table class="table table-striped align-middle">
	                        <thead>
	                            <tr>
	                                <th scope="col">動作</th>
	                                <th scope="col">對應JointPoint</th>
	                                <th scope="col">Advice觸發點</th>
	                                <th scope="col">連結</th>
	                            </tr>
	                        </thead>
	                        <tbody class="table-group-divider">
	                            <tr>
	                                <th scope="row">speakBeanName</th>
	                                <td>jointpointBefore</td>
	                                <td>before</td>
	                                <td>
	                                    <a href="<%=application.getContextPath()%>/tutorial/speak" class="btn btn-primary" role="button">點我試試</a>
	                                </td>
	                            </tr>
	                            <tr>
	                                <th scope="row">byebye</th>
	                                <td>jointpointAfterFinally</td>
	                                <td>After</td>
	                                <td>
	                                    <a href="<%=application.getContextPath()%>/tutorial/bye" class="btn btn-primary" role="button">點我試試</a>
	                                </td>
	                            </tr>
	                            <tr>
	                                <th scope="row">returnBeanName</th>
	                                <td>jointpointAfterReturn</td>
	                                <td>After-return</td>
	                                <td>
	                                    <a href="<%=application.getContextPath()%>/tutorial/returnname" class="btn btn-primary " role="button">點我試試</a>
	                                </td>
	                            </tr>
	                            <tr>
	                                <th scope="row">throwError</th>
	                                <td>jointpointAfterThrow</td>
	                                <td>After-throw</td>
	                                <td>
	                                    <a href="<%=application.getContextPath()%>/tutorial/throwerror" class="btn btn-danger" role="button">點後報錯</a>
	                                </td>
	                            </tr>
                                <tr>
	                                <th scope="row">Bean的全部方法</th>
	                                <td>jointpointAround</td>
	                                <td colspan="2">Around</td>
	                            </tr>
	                        </tbody>
	                    </table>
	                </div>
	                <div class="col">
	                    <h1>Lab</h1>
	                    <table class="table table-striped align-middle">
	                        <thead>
	                            <tr>
	                                <th scope="col">動作</th>
	                                <th scope="col">對應JointPoint</th>
	                                <th scope="col">Advice觸發點</th>
	                                <th scope="col">連結</th>
	                            </tr>
	                        </thead>
	                        <tbody class="table-group-divider">
	                            <tr>
	                                <th scope="row">drive</th>
	                                <td>labBefore</td>
	                                <td>before</td>
	                                <td>
	                                    <a href="<%=application.getContextPath()%>/lab/drive" class="btn btn-primary" role="button">點我試試</a>
	                                </td>
	                            </tr>
	                            <tr>
	                                <th scope="row">getOutCar</th>
	                                <td>labAfterFinally</td>
	                                <td>After</td>
	                                <td>
	                                    <a href="<%=application.getContextPath()%>/lab/getout" class="btn btn-primary" role="button">點我試試</a>
	                                </td>
	                            </tr>
	                            <tr>
	                                <th scope="row">showCarName</th>
	                                <td>labAfterReturn</td>
	                                <td>After-return</td>
	                                <td>
	                                    <a href="<%=application.getContextPath()%>/lab/show" class="btn btn-primary" role="button">點我試試</a>
	                                </td>
	                            </tr>
	                            <tr>
	                                <th scope="row">bang</th>
	                                <td>labAfterThrow</td>
	                                <td>After-throw</td>
	                                <td>
	                                    <a href="<%=application.getContextPath()%>/lab/bang" class="btn btn-danger" role="button">點後報錯</a>
	                                </td>
	                            </tr>
                                <tr>
	                                <th scope="row">Benz的全部方法</th>
	                                <td>labAround</td>
	                                <td colspan="2">Around</td>
	                            </tr>
	                        </tbody>
	                    </table>
	                </div>
	            </div>
	        </div>
	    </main>
	
		<%@include file="/StickyFooter.jsp" %>
	
	</body>

</html>