using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Shapes;

namespace T01_VentanaDialogoPersonalizado
{
    /// <summary>
    /// Lógica de interacción para IntroducirEmail.xaml
    /// </summary>
    public partial class IntroducirEmail : Window
    {

        /* /
         * Constructor sin parametros, para cuando no pidamos una pregunta coja la que hay por defecto en el .xaml
         * 
         */
        public IntroducirEmail()
        {
            InitializeComponent();
        }

        /* *
         * Constructor que recoge por parametro una pregunta y respuesta para la ventana dialogo
         */
        public IntroducirEmail(string question, string defaultRespuesta = "")
        {
            InitializeComponent();

            lblQuestion.Content = question;

            txtRespuestaEmail.Text = defaultRespuesta;
        }

        /* *
         *  Metodo para el boton aceptar que confirma el email introducido en textBox.
         */
        private void dialogAceptarEmail(object sender, RoutedEventArgs e)
        {
            this.DialogResult = true;
        }

        /* *
         * 
         */
        private void Window_ContentRendered(object sender, EventArgs e)
        {
            txtRespuestaEmail.SelectAll();
            txtRespuestaEmail.Focus();
        }

        /* *
         * Metodo que recoge el email del textBox y lo guarda.
         */
        public string Respuesta
        {
            get { return txtRespuestaEmail.Text; }
        }

    }
}
