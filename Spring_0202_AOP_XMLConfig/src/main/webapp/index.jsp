<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title><%=application.getContextPath()%></title>
    <script src="https://code.jquery.com/jquery-3.7.1.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
      rel="stylesheet"
    />
    <style type="text/css">
      .custombtn {
        width: 100%;
      }
    </style>
  </head>
  <body>
    <div class="container-lg">
      <div
        class="btn-group"
        role="group"
        aria-label="Basic radio toggle button group"
      >
        <input
          type="radio"
          class="btn-check"
          name="btnradio"
          id="btnradio1"
          autocomplete="off"
          value="beanA"
          checked
        />
        <label class="btn btn-outline-primary" for="btnradio1">BeanA</label>
        <input
          type="radio"
          class="btn-check"
          name="btnradio"
          id="btnradio2"
          autocomplete="off"
          value="beanB"
        />
        <label class="btn btn-outline-primary" for="btnradio2">BeanB</label>
        <input
          type="radio"
          class="btn-check"
          name="btnradio"
          id="btnradio3"
          autocomplete="off"
          value="beanC"
        />
        <label class="btn btn-outline-primary" for="btnradio3">BeanC</label>
      </div>
    </div>
    <div class="container-lg">
      <div class="row">
        <div class="col"></div>
        <div class="col">
          <button id="1" class="custombtn btn btn-primary">呼叫speak</button>
        </div>
        <div class="col"></div>
      </div>
      <div class="row">
        <div class="col"></div>
        <div class="col">
          <button id="2" class="custombtn btn btn-secondary">呼叫bye</button>
        </div>
        <div class="col"></div>
      </div>
      <div class="row">
        <div class="col"></div>
        <div class="col">
          <button id="3" class="custombtn btn btn-success">
            呼叫returnname
          </button>
        </div>
        <div class="col"></div>
      </div>
      <div class="row">
        <div class="col"></div>
        <div class="col">
          <button id="4" class="custombtn btn btn-warning">
            呼叫throwerror
          </button>
        </div>
        <div class="col"></div>
      </div>
    </div>
  </body>

  <script type="text/javascript">
    let bean = document.querySelector('input[name="btnradio"]:checked').value
    $('.btn-check').on('click', () => {
      bean = document.querySelector('input[name="btnradio"]:checked').value
    })
    $('#1').on('click', () => {
      $.ajax({
        url: 'helloworld?bean=' + bean + '&action=speak',
      }).done(function (msg) {
        Swal.fire(msg)
      })
    })
    $('#2').on('click', () => {
      $.ajax({
        url: 'helloworld?bean=' + bean + '&action=bye',
      }).done(function (msg) {
        Swal.fire(msg)
      })
    })
    $('#3').on('click', () => {
      $.ajax({
        url: 'helloworld?bean=' + bean + '&action=returnname',
      }).done(function (msg) {
        Swal.fire(msg)
      })
    })
    $('#4').on('click', () => {
      $.ajax({
        url: 'helloworld?bean=' + bean + '&action=throwerror',
      })
        .done(function (msg) {
          Swal.fire(msg)
        })
        .fail(function (msg) {
          Swal.fire('throwerror 呼叫成功 回傳500')
        })
    })
  </script>
</html>
