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

namespace WPF_Relacion07_IvanSM
{
    /// <summary>
    /// Lógica de interacción para RellenarEmail.xaml
    /// </summary>
    public partial class RellenarEmail : Window
    {
        public RellenarEmail()
        {
            InitializeComponent();
        }

        public RellenarEmail(string question, string defaultRespuesta = "")
        {
            InitializeComponent();

            lblQuestion.Content = question;

            txtRespuestaEmail.Text = defaultRespuesta;
        }

        private void dialogAceptarEmail(object sender, RoutedEventArgs e)
        {
            this.DialogResult = true;
        }

        private void Window_ContentRendered(object sender, EventArgs e)
        {
            txtRespuestaEmail.SelectAll();
            txtRespuestaEmail.Focus();
        }
        public string Respuesta
        {
            get { return txtRespuestaEmail.Text; }
        }
    }
}
