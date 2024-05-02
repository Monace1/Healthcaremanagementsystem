<html>
<head>
  <title>HealthCareManagement</title>
  <%@include file="/Components/Css.jsp"%>
  <style>
    body {
      background-color: #f8f9fa;
    }
    .carousel-item img {
      max-height: 400px;
      width: auto;
      margin: auto;
    }
    .carousel {
      max-width: 1000px;
      margin: auto;
    }
    .info-section {
      padding: 20px;
      background-color: #ffffff;
      margin-top: 20px;
    }
    .info-section h2 {
      color: #333333;
    }
    .info-section p {
      color: #666666;
    }
    .cta-button {
      background-color: #007bff;
      color: #ffffff;
      padding: 10px 20px;
      border: none;
      border-radius: 5px;
      cursor: pointer;
      margin-top: 20px;
    }
  </style>
</head>
<body>
<%@include file="/Components/navbar.jsp"%>

<div id="carouselExampleControls" class="carousel slide" data-bs-ride="carousel">
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img src="Img/13.jpg" class="d-block w-100" alt="Image 1">
    </div>
    <div class="carousel-item">
      <img src="Img/10.jpg" class="d-block w-100" alt="Image 2">
    </div>
    <div class="carousel-item">
      <img src="Img/11.jpg" class="d-block w-100" alt="Image 3">
    </div>
    <div class="carousel-item">
      <img src="Img/12.jpg" class="d-block w-100" alt="Image 4">
    </div>
    <div class="carousel-item">
      <img src="Img/hospital.jpg" class="d-block w-100" alt="Image 5">
    </div>
  </div>
  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Previous</span>
  </button>
  <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Next</span>
  </button>
</div>

<div class="info-section">
  <h2>Welcome to HealthCareManagement</h2>
  <p>We are dedicated to providing high-quality healthcare services to our community. Our team of experienced professionals is committed to your well-being.</p>
  <button class="cta-button">Learn More</button>
</div>

<div class="info-section">
   <h2>Our Services</h2>
   <p>Explore our wide range of healthcare services designed to meet your needs. From preventive care to specialized treatments, we've got you covered.</p>
   <a href="services.jsp" class="cta-button">View Services</a>
 </div>

<div class="info-section">
  <h2>Stay Informed</h2>
  <p>Stay up-to-date with the latest health tips, news, and events. Subscribe to our newsletter to receive valuable information directly to your inbox.</p>
  <button class="cta-button">Subscribe Now</button>
</div>

<%@include file="/Components/footer.jsp"%>
</body>
</html>
