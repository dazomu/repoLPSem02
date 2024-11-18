package control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Cuadrado;
import modelo.Rectangulo;
import modelo.Resultado;
import modelo.Triangulo;

/**
 * Servlet implementation class Control02
 */
@WebServlet("/Control02")
public class Control02 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Control02() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	
		String pagina = request.getParameter("pagina");
	    Resultado resultado = new Resultado();

	    if (pagina.equals("index")) {
	        String figura = request.getParameter("figura");

	        if (figura.equals("Triangulo")) {
	            request.getRequestDispatcher("/pagTriangulo.jsp").forward(request, response);
	        } else if (figura.equals("Cuadrado")) {
	            request.getRequestDispatcher("/pagCuadrado.jsp").forward(request, response);
	        } else if (figura.equals("Rectangulo")) {
	            request.getRequestDispatcher("/pagRectangulo.jsp").forward(request, response);
	        }
	    } else if (pagina.equals("pagTriangulo")) {
	        try {
	            double ladoA = Double.parseDouble(request.getParameter("ladoA"));
	            double ladoB = Double.parseDouble(request.getParameter("ladoB"));
	            double ladoC = Double.parseDouble(request.getParameter("ladoC"));

	            Triangulo triangulo = new Triangulo(ladoA, ladoB, ladoC);
	            resultado.setPerimetro(triangulo.perimetro());
	            resultado.setArea(triangulo.area());
	            resultado.setTipo("Triangulo");

	            request.setAttribute("objeto", resultado);
	            request.getRequestDispatcher("/mostrarResultado02.jsp").forward(request, response);
	        } catch (NumberFormatException e) {
	        	
	            // Manejo de error: parámetros no válidos
	            request.setAttribute("error", "Los valores de los lados deben ser números válidos.");
	            request.getRequestDispatcher("/pagTriangulo.jsp").forward(request, response);
	        }
	    } else if (pagina.equals("pagCuadrado")) {
	        try {
	            double lado = Double.parseDouble(request.getParameter("lado"));
	            // Aquí puedes calcular el área y perímetro del cuadrado
	            // y luego redirigir a mostrarResultado02.jsp
	            
	            Cuadrado cuadrado = new Cuadrado(lado);
	            
	            resultado.setPerimetro(cuadrado.perimetro());
	            resultado.setArea(cuadrado.area());
	            resultado.setTipo("Cuadrado");
	            
	            request.setAttribute("objeto", resultado);
	            request.getRequestDispatcher("/mostrarResultado02.jsp").forward(request, response);
	            
	        } catch (NumberFormatException e) {
	            // Manejo de error: parámetros no válidos
	            request.setAttribute("error", "El valor del lado debe ser un número válido.");
	            request.getRequestDispatcher("/mostrarResultado02.jsp").forward(request, response);
	        }
	
	    } else if (pagina.equals("pagRectangulo")) {
	    	
	    	try {
				
	    		double base = Double.parseDouble(request.getParameter("base"));
	    		double altura = Double.parseDouble(request.getParameter("altura"));
	    		
	    		Rectangulo rectangulo = new Rectangulo(base, altura);
	    		
	    		resultado.setArea(rectangulo.area());
	    		resultado.setPerimetro(rectangulo.perimetro());
	    		resultado.setTipo("Rectangulo");
	    		
	    		request.setAttribute("objeto", resultado);
	    		request.getRequestDispatcher("/mostrarResultado02.jsp").forward(request, response);
	    		
			} catch (Exception e) {
				// TODO: handle exception
			}
	    	
	    }
	    
	}
			
	
}
